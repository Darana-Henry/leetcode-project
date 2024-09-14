//https://leetcode.com/problems/count-distinct-numbers-on-board/
package algorithms.easy;

public class CountDistinctNumbersOnBoard {
    public static void main(String[] args) {
        CountDistinctNumbersOnBoard board = new CountDistinctNumbersOnBoard();
        System.out.println("Output:\t" + board.distinctIntegers(5));
        System.out.println("Output:\t" + board.distinctIntegers(3));
    }

    public int distinctIntegers(int n) {
        return Math.max(n - 1, 1);
    }
}
