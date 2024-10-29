//https://leetcode.com/problems/jump-game/
package algorithms.medium.j;

public class JumpGame {
    public static void main(String[] args) {
        JumpGame jump = new JumpGame();
        System.out.println("Output:\t" + jump.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println("Output:\t" + jump.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public boolean canJump(int[] nums) {
        int lastGoodSpot = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if ((i + nums[i]) >= (lastGoodSpot))
                lastGoodSpot = i;
        }
        return lastGoodSpot == 0;
    }
}
