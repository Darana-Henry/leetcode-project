//https://leetcode.com/problems/richest-customer-wealth/
package algorithms.easy.r;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        RichestCustomerWealth wealth = new RichestCustomerWealth();
        System.out.println("Output:\t" + wealth.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        System.out.println("Output:\t" + wealth.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        System.out.println("Output:\t" + wealth.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] row : accounts) {
            int wealth = 0;
            for (int amount : row)
                wealth += amount;
            max = Math.max(max, wealth);
        }
        return max;
    }
}
