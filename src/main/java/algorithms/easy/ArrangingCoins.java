//https://leetcode.com/problems/arranging-coins/description/
package algorithms.easy;

public class ArrangingCoins {
    public static void main(String[] args) {
        ArrangingCoins coins = new ArrangingCoins();
        System.out.println("Output:\t" + coins.arrangeCoinsBestSolution(5));
        System.out.println("Output:\t" + coins.arrangeCoinsBruteForce(8));
    }

    public int arrangeCoinsBestSolution(int n) {
        return (int) Math.floor(-0.5 + Math.sqrt((double) 2 * n + 0.25));
    }

    public int arrangeCoinsBruteForce(int n) {
        int index = 1;
        int rows = 0;
        while (index <= n) {
            rows++;
            n -= index;
            index++;
        }
        return rows;
    }
}
