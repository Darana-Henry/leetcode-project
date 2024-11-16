//https://leetcode.com/problems/neither-minimum-nor-maximum/
package algorithms.easy.n;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args) {
        NeitherMinimumNorMaximum neither = new NeitherMinimumNorMaximum();
        System.out.println("Output:\t" + neither.findNonMinOrMax(new int[]{3, 2, 1, 4}));
        System.out.println("Output:\t" + neither.findNonMinOrMax(new int[]{1, 2}));
        System.out.println("Output:\t" + neither.findNonMinOrMax(new int[]{2, 1, 3}));
    }

    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int num : nums)
            if (num != min && num != max) return num;

        return -1;
    }
}
