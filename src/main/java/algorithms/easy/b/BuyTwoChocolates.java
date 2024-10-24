//https://leetcode.com/problems/buy-two-chocolates/
package algorithms.easy.b;

import java.util.Arrays;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        BuyTwoChocolates chocolates = new BuyTwoChocolates();
        System.out.println("Output:\t" + chocolates.buyChoco(new int[]{1, 2, 2}, 3));
        System.out.println("Output:\t" + chocolates.buyChoco(new int[]{3, 2, 3}, 3));
    }

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return prices[0] + prices[1] <= money ? (money - (prices[0] + prices[1])) : money;
    }
}
