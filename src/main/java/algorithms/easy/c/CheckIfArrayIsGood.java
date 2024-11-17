//https://leetcode.com/problems/check-if-array-is-good/
package algorithms.easy.c;

public class CheckIfArrayIsGood {
    public static void main(String[] args) {
        CheckIfArrayIsGood good = new CheckIfArrayIsGood();
        System.out.println("Output:\t" + good.isGood(new int[]{2, 1, 3}));
        System.out.println("Output:\t" + good.isGood(new int[]{1, 3, 3, 2}));
        System.out.println("Output:\t" + good.isGood(new int[]{1, 1}));
        System.out.println("Output:\t" + good.isGood(new int[]{3, 4, 4, 1, 2, 1}));
    }

    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        int[] count = new int[201];

        for (int num : nums)
            count[num]++;

        count[n] -= 2;

        for (int i = 1; i < n; ++i)
            count[i] -= 1;

        for (int c : count)
            if (c != 0) return false;

        return true;
    }
}
