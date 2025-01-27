//https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/
package algorithms.medium.c;

public class CountServersThatCommunicate {
    int max, count;
    int[] nums;

    public static void main(String[] args) {
        CountServersThatCommunicate obj = new CountServersThatCommunicate();
        System.out.println("Output:\t" + obj.countMaxOrSubsets(new int[]{3, 1}));
        System.out.println("Output:\t" + obj.countMaxOrSubsets(new int[]{2, 2, 2}));
        System.out.println("Output:\t" + obj.countMaxOrSubsets(new int[]{3, 2, 1, 5}));
    }


    public int countMaxOrSubsets(int[] nums) {
        this.nums = nums;

        for (int num : nums)
            max |= num;

        dfs(0, 0);
        return count;
    }

    public void dfs(int index, int cOR) {
        if (index == nums.length) {
            if (cOR == max) count++;
            return;
        }

        dfs(index + 1, cOR);
        dfs(index + 1, cOR | nums[index]);
    }
}
