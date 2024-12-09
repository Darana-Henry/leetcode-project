//https://leetcode.com/problems/special-array-ii/
package algorithms.medium.s;

public class SpecialArrayII {
    public static void main(String[] args) {
        SpecialArrayII special = new SpecialArrayII();
        System.out.println(
                "Output:\t" + special.isArraySpecialOptimized(new int[]{2, 7, 2}, new int[][]{{0, 0}, {1, 2}}));
        System.out.println(
                "Output:\t" + special.isArraySpecialOptimized(new int[]{3, 4, 1, 2, 6}, new int[][]{{0, 4}}));
        System.out.println(
                "Output:\t" + special.isArraySpecialOptimized(new int[]{4, 3, 1, 6}, new int[][]{{0, 2}, {2, 3}}));
        System.out.println("Output:\t" + special.isArraySpecial(new int[]{2, 7, 2}, new int[][]{{0, 0}, {1, 2}}));
        System.out.println("Output:\t" + special.isArraySpecial(new int[]{3, 4, 1, 2, 6}, new int[][]{{0, 4}}));
        System.out.println("Output:\t" + special.isArraySpecial(new int[]{4, 3, 1, 6}, new int[][]{{0, 2}, {2, 3}}));
    }

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        int index = 0;

        for (int[] q : queries) {
            result[index] = true;
            for (int i = q[0]; i < q[1]; i++) {
                if (nums[i] == nums[i + 1] || ((nums[i] - nums[i + 1]) % 2) == 0) {
                    result[index] = false;
                    break;
                }
            }
            index++;
        }

        return result;
    }

    public boolean[] isArraySpecialOptimized(int[] nums, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        int[] ps = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            ps[i] = ps[i - 1];
            if (nums[i - 1] % 2 == nums[i] % 2) ps[i]++;
        }

        for (int i = 0; i < queries.length; i++) {
            result[i] = (ps[queries[i][1]] - ps[queries[i][0]]) <= 0;
        }

        return result;
    }
}