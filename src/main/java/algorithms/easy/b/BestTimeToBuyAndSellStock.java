package algorithms.easy.b;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();

        int[] rowIndex = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println("Output:\t" + stock.maxProfit(rowIndex));

        int[] rowIndex2 = new int[]{7, 6, 4, 3, 1};
        System.out.println("Output:\t" + stock.maxProfit(rowIndex2));
    }

    public int maxProfit(int[] prices) {

        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minVal)
                minVal = prices[i];
            else if (prices[i] - minVal > maxProfit)
                maxProfit = prices[i] - minVal;
        }
        return maxProfit;
    }
}
