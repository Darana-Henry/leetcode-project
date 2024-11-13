//https://leetcode.com/problems/find-if-digit-game-can-be-won/
package algorithms.easy.f;

public class FindIfDigitGameCanBeWon {
    public static void main(String[] args) {
        FindIfDigitGameCanBeWon game = new FindIfDigitGameCanBeWon();
        System.out.println("Output:\t" + game.canAliceWin(new int[]{1, 2, 3, 4, 10}));
        System.out.println("Output:\t" + game.canAliceWin(new int[]{1, 2, 3, 4, 5, 14}));
        System.out.println("Output:\t" + game.canAliceWin(new int[]{5, 5, 5, 25}));
    }

    public boolean canAliceWin(int[] nums) {
        int first = 0, second = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 9) first += nums[i];
            else second += nums[i];
        }

        return first > second || second > first;
    }
}
