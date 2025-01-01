//https://leetcode.com/problems/global-and-local-inversions/
package algorithms.medium.g;

public class GlobalAndLocalInversions {
    public static void main(String[] args) {
        GlobalAndLocalInversions obj = new GlobalAndLocalInversions();
        System.out.println("Output:\t" + obj.isIdealPermutation(new int[]{1, 0, 2}));
        System.out.println("Output:\t" + obj.isIdealPermutation(new int[]{1, 2, 0}));
    }

    public boolean isIdealPermutation(int[] nums) {
        int max = -1;
        for (int i = 0; i < nums.length - 2; i++) {
            max = Math.max(max, nums[i]);
            if (max > nums[i + 2]) return false;
        }
        return true;
    }
}
