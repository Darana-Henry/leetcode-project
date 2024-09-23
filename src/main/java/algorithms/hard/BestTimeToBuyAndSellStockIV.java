//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
package algorithms.hard;


public class BestTimeToBuyAndSellStockIV {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIV profit = new BestTimeToBuyAndSellStockIV();
        System.out.println("Output:\t" + profit.maxProfit(2, new int[]{2, 4, 1}));
        System.out.println("Output:\t" + profit.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
    }

    public int maxProfit(int k, int[] prices) {
        int noOfDays = prices.length;
        int[][] profits = new int[k + 1][2];

        for (int transactionCount = 1; transactionCount <= k; transactionCount++)
            profits[transactionCount][1] = -prices[0];

        for (int dayIndex = 1; dayIndex < noOfDays; dayIndex++) {
            for (int transactionCount = k; transactionCount > 0; transactionCount--) {
                profits[transactionCount][0] = Math.max(profits[transactionCount][1] + prices[dayIndex],
                        profits[transactionCount][0]);
                profits[transactionCount][1] = Math.max(profits[transactionCount - 1][0] - prices[dayIndex],
                        profits[transactionCount][1]);
            }
        }
        return profits[k][0];
    }
}
