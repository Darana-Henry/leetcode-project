//https://leetcode.com/problems/guess-number-higher-or-lower/description/
package algorithms.easy;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower();
        System.out.println("Output:\t" + guess.guessNumber(10));
        System.out.println("Output:\t" + guess.guessNumber(1));
        System.out.println("Output:\t" + guess.guessNumber(2));
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (guess(mid) == 0) return mid;
            else if (guess(mid) == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int guess(int num) {
        return 0;
    }
}
