//https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
package algorithms.easy.n;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public static void main(String[] args) {
        NumberOfRectanglesThatCanFormTheLargestSquare square = new NumberOfRectanglesThatCanFormTheLargestSquare();
        System.out.println("Output:\t" + square.countGoodRectangles(new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}}));
        System.out.println("Output:\t" + square.countGoodRectangles(new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}}));
    }

    public int countGoodRectangles(int[][] rectangles) {
        int answer = 0, max = 0;

        for (int[] rect : rectangles) {
            int min = Math.min(rect[0], rect[1]);
            if (max < min) {
                max = min;
                answer = 1;
            } else if (max == min) answer++;

        }
        return answer;

    }
}
