//https://leetcode.com/problems/semi-ordered-permutation/
package algorithms.easy;

public class SemiOrderedPermutation {
    public static void main(String[] args) {
        SemiOrderedPermutation perm = new SemiOrderedPermutation();
        System.out.println("Output:\t" + perm.semiOrderedPermutation(new int[]{2, 1, 4, 3}));
        System.out.println("Output:\t" + perm.semiOrderedPermutation(new int[]{2, 4, 1, 3}));
        System.out.println("Output:\t" + perm.semiOrderedPermutation(new int[]{1, 3, 4, 2, 5}));
    }

    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int min = 0, max = 0;
        if (nums[0] == 1 && nums[n - 1] == n) return 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) min = i;
            if (nums[i] == n) max = i;
        }

        int factor = min < max ? 1 : 2;
        return min + n - max - factor;
    }
}
