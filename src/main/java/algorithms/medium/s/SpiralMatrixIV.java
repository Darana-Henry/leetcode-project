//https://leetcode.com/problems/spiral-matrix-iv/
package algorithms.medium.s;

import context.ListNode;

import java.util.Arrays;

public class SpiralMatrixIV {
    public static void main(String[] args) {
        SpiralMatrixIV obj = new SpiralMatrixIV();
        System.out.println("Output:\t" + obj.spiralMatrix(3, 5, new ListNode(3, new ListNode(0, new ListNode(2,
                new ListNode(6, new ListNode(8, new ListNode(1, new ListNode(7, new ListNode(9,
                        new ListNode(4, new ListNode(2, new ListNode(5, new ListNode(5, new ListNode(0)))))))))))))));
        System.out.println("Output:\t" + obj.spiralMatrix(1, 4, new ListNode(0, new ListNode(1, new ListNode(2)))));
    }

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int r = 0, c = 0, dir = 0;
        int[][] answer = new int[m][n];
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int[] row : answer)
            Arrays.fill(row, -1);

        while (head != null) {
            answer[r][c] = head.val;
            head = head.next;

            int nr = r + dirs[dir][0];
            int nc = c + dirs[dir][1];

            if (nr < 0 || nc < 0 || nr >= m || nc >= n || answer[nr][nc] >= 0) {
                dir = (dir + 1) % 4;
                nr = r + dirs[dir][0];
                nc = c + dirs[dir][1];
            }
            r = nr;
            c = nc;
        }

        return answer;
    }
}
