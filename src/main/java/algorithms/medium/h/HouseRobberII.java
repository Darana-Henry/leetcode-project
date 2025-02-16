//https://leetcode.com/problems/house-robber-ii/
package algorithms.medium.h;

public class HouseRobberII {
    public static void main(String[] args) {
        HouseRobberII obj = new HouseRobberII();
        System.out.println("Output:\t" + obj.rob(new int[]{2, 3, 2}));
        System.out.println("Output:\t" + obj.rob(new int[]{1, 2, 3, 1}));
        System.out.println("Output:\t" + obj.rob(new int[]{1, 2, 3}));
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(loot(nums, 0, n - 2), loot(nums, 1, n - 1));
    }

    public int loot(int[] nums, int start, int end) {
        int wPrev = 0, exPrev = 0;

        for (int i = start; i <= end; i++) {
            int curr = exPrev + nums[i];
            exPrev = Math.max(wPrev, exPrev);
            wPrev = curr;
        }

        return Math.max(wPrev, exPrev);
    }
}
