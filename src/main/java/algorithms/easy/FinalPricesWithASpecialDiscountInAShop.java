//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
package algorithms.easy;

import java.util.Stack;

public class FinalPricesWithASpecialDiscountInAShop {
    public static void main(String[] args) {
        FinalPricesWithASpecialDiscountInAShop discount = new FinalPricesWithASpecialDiscountInAShop();
        System.out.println("Output:\t" + discount.finalPrices(new int[]{8, 4, 6, 2, 3}));
        System.out.println("Output:\t" + discount.finalPrices(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + discount.finalPrices(new int[]{10, 1, 1, 6}));
    }

    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }
            if (!stack.isEmpty())
                answer[i] = prices[i] - stack.peek();
            else
                answer[i] = prices[i];

            stack.push(prices[i]);
        }
        return answer;
    }
}
