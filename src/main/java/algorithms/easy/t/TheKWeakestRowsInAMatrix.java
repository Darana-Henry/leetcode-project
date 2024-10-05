//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
package algorithms.easy.t;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        TheKWeakestRowsInAMatrix weakest = new TheKWeakestRowsInAMatrix();
        System.out.println("Output:\t" + weakest.kWeakestRows(
                new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3));
        System.out.println(
                "Output:\t" + weakest.kWeakestRows(new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}},
                        2));
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] soldiers = new int[rows];
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            indices.add(i);
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] != 0) soldiers[i]++;
                else break;
            }
        }

        indices.sort(Comparator.comparingInt(i -> soldiers[i]));
        int[] answer = new int[k];
        for (int i = 0; i < k; i++)
            answer[i] = indices.get(i);

        return answer;
    }
}
