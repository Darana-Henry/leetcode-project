//https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
package algorithms.easy.m;

import java.util.Arrays;

public class MaximumNumberOfBallsInABox {
    public static void main(String[] args) {
        MaximumNumberOfBallsInABox balls = new MaximumNumberOfBallsInABox();
        System.out.println("Output:\t" + balls.countBalls(1, 10));
        System.out.println("Output:\t" + balls.countBalls(5, 15));
        System.out.println("Output:\t" + balls.countBalls(19, 28));
    }

    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[50];
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            for (int num = i; num > 0; num /= 10)
                sum += num % 10;
            count[sum]++;
        }
        return Arrays.stream(count).max().getAsInt();
    }
}
