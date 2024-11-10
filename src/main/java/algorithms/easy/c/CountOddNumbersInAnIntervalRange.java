//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
package algorithms.easy.c;

public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        CountOddNumbersInAnIntervalRange interval = new CountOddNumbersInAnIntervalRange();
        System.out.println("Output:\t" + interval.countOdds(3, 7));
        System.out.println("Output:\t" + interval.countOdds(8, 10));
    }

    public int countOdds(int low, int high) {
        return ((high + 1) >> 1) - (low >> 1);
    }
}
