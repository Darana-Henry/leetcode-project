//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
package algorithms.medium;

public class BestTimeToBuyAndSellStockWithTransactionFee {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockWithTransactionFee bestBuy = new BestTimeToBuyAndSellStockWithTransactionFee();
        System.out.println("Output:\t" + bestBuy.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
        System.out.println("Output:\t" + bestBuy.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }

    public int maxProfit(int[] prices, int fee) {
        int profit = 0;
        int buyAt = prices[0];
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - buyAt - fee);
            buyAt = Math.min(buyAt, prices[i] - profit);
        }
        return profit;
    }
}
