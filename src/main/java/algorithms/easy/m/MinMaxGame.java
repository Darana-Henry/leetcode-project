//https://leetcode.com/problems/min-max-game/
package algorithms.easy.m;

public class MinMaxGame {
    public static void main(String[] args) {
        MinMaxGame minMaxGame = new MinMaxGame();
        System.out.println("Output:\t" + minMaxGame.minMaxGame(new int[]{1, 3, 5, 2, 4, 8, 2, 2}));
        System.out.println("Output:\t" + minMaxGame.minMaxGame(new int[]{3}));
    }

    public int minMaxGame(int[] nums) {
        int answer = 0;
        int n = nums.length;
        while (n >= 2) {
            int[] curr = new int[n / 2];
            for (int i = 0; i < n / 2; i++) {
                if (i % 2 == 0) curr[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                if (i % 2 == 1) curr[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
            nums = curr;
            n = nums.length;
        }
        return nums[0];
    }

    public int minMaxGameOptimized(int[] nums) {
        for (int n = nums.length; n > 1; n -= (n / 2))
            for (int i = 0; i < n / 2; i++)
                nums[i] = i % 2 == 1 ? Math.max(nums[2 * i], nums[2 * i + 1]) : Math.min(nums[2 * i], nums[2 * i + 1]);
        return nums[0];
    }
}
