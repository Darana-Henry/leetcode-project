//https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/
package algorithms.medium.m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumOperationsToMakeAUniValueGrid {
    public static void main(String[] args) {
        MinimumOperationsToMakeAUniValueGrid obj = new MinimumOperationsToMakeAUniValueGrid();
        System.out.println("Output:\t" + obj.minOperations(new int[][]{{2, 4}, {6, 8}}, 2));
        System.out.println("Output:\t" + obj.minOperations(new int[][]{{1, 5}, {2, 3}}, 1));
        System.out.println("Output:\t" + obj.minOperations(new int[][]{{1, 2}, {3, 4}}, 2));
    }

    public int minOperations(int[][] grid, int x) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int[] row : grid)
            for (int num : row)
                list.add(num);

        Collections.sort(list);
        int mid = list.get(list.size() / 2);

        for (int num : list) {
            if (num % x != mid % x) return -1;
            answer += Math.abs(num - mid) / x;
        }
        return answer;
    }
}
