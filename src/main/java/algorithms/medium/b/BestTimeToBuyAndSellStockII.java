//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
package algorithms.medium.b;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockII stock = new BestTimeToBuyAndSellStockII();
        System.out.println("Output:\t" + stock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println("Output:\t" + stock.maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + stock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public int maxProfit(int[] prices) {
        int output = 0;
        int previous = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (previous < prices[i]) output += prices[i] - previous;
            previous = prices[i];
        }
        return output;
    }
}
