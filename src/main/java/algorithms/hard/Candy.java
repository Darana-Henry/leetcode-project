//https://leetcode.com/problems/candy/
package algorithms.hard;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        Candy candy = new Candy();
        System.out.println("Output:\t" + candy.candy(new int[]{1, 0, 2}));
        System.out.println("Output:\t" + candy.candy(new int[]{1, 2, 2}));
        System.out.println("Output:\t" + candy.candyOptimized(new int[]{1, 0, 2}));
        System.out.println("Output:\t" + candy.candyOptimized(new int[]{1, 2, 2}));
    }

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];
        int candies = 0;
        Arrays.fill(candy, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) candy[i] = candy[i - 1] + 1;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) candy[i] = Math.max(candy[i], candy[i + 1] + 1);
        }

        for (int c : candy)
            candies += c;

        return candies;
    }

    public int candyOptimized(int[] ratings) {
        int n = ratings.length;
        int candies = 1;
        int increasing = 0;
        int decreasing = 0;
        int peak = 0;
        for (int i = 1; i < n; i++) {
            if (ratings[i - 1] < ratings[i]) {
                increasing++;
                decreasing = 0;
                peak = increasing + 1;
                candies += peak;
            } else if (ratings[i - 1] == ratings[i]) {
                peak = 0;
                increasing = 0;
                decreasing = 0;
                candies++;
            } else {
                increasing = 0;
                decreasing++;
                candies += decreasing + (peak > decreasing ? 0 : 1);
            }
        }
        return candies;
    }
}
