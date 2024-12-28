//https://leetcode.com/problems/find-the-winner-of-an-array-game/
package algorithms.medium.f;

public class FindTheWinnerOfAnArrayGame {
    public static void main(String[] args) {
        FindTheWinnerOfAnArrayGame obj = new FindTheWinnerOfAnArrayGame();
        System.out.println("Output:\t" + obj.getWinner(new int[]{2, 1, 3, 5, 4, 6, 7}, 2));
        System.out.println("Output:\t" + obj.getWinner(new int[]{3, 2, 1}, 10));
    }

    public int getWinner(int[] arr, int k) {
        int max = arr[0], count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                count = 1;
            } else count++;

            if (count == k) break;
        }

        return max;
    }
}
