//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
package algorithms.hard;

public class BestTimeToBuyAndSellStockIII {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIII buy = new BestTimeToBuyAndSellStockIII();
        System.out.println("Output:\t" + buy.maxProfitOptimized(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        System.out.println("Output:\t" + buy.maxProfitOptimized(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + buy.maxProfitOptimized(new int[]{7, 6, 4, 3, 1}));
    }

    public int maxProfitOptimized(int[] prices) {
        int firstBuy = -prices[0], secondBuy = -prices[0];
        int firstProfit = 0, totalProfit = 0;

        for (int price : prices) {
            firstBuy = Math.max(firstBuy, -price);
            firstProfit = Math.max(firstProfit, price + firstBuy);
            secondBuy = Math.max(secondBuy, firstProfit - price);
            totalProfit = Math.max(totalProfit, price + secondBuy);
        }

        return totalProfit;
    }
}
