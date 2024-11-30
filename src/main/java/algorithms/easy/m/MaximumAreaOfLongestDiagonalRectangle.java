//https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/
package algorithms.easy.m;

public class MaximumAreaOfLongestDiagonalRectangle {
    public static void main(String[] args) {
        MaximumAreaOfLongestDiagonalRectangle diagonal = new MaximumAreaOfLongestDiagonalRectangle();
        System.out.println("Output:\t" + diagonal.areaOfMaxDiagonal(new int[][]{{9, 3}, {8, 6}}));
        System.out.println("Output:\t" + diagonal.areaOfMaxDiagonal(new int[][]{{3, 4}, {4, 3}}));
    }

    public int areaOfMaxDiagonal(int[][] dimensions) {
        int answer = 0, max = 0;

        for (int[] dim : dimensions) {
            int l = dim[0];
            int w = dim[1];
            int diag = l * l + w * w;

            if (max < diag) {
                answer = l * w;
                max = diag;
            } else if (max == diag) answer = Math.max(answer, l * w);
        }

        return answer;
    }
}
