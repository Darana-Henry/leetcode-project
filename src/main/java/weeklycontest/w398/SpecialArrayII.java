package weeklycontest.w398;

public class SpecialArrayII {

    public static void main(String[] args) {
        SpecialArrayII specialArrayII = new SpecialArrayII();
        System.out.println(
                "Output:\t" + specialArrayII.isArraySpecial(new int[]{3, 4, 1, 2, 6}, new int[][]{{0, 2}, {2, 3}}));

        System.out.println(
                "Output:\t" + specialArrayII.isArraySpecial(new int[]{4, 3, 1, 6}, new int[][]{{0, 2}, {2, 3}}));

    }

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if ((nums[queries[i][0]] - nums[queries[i][1]]) % 2 != 0)
                result[i] = true;
            else
                result[i] = false;
        }
        return result;
    }
}
