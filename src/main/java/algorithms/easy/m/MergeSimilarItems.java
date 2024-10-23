//https://leetcode.com/problems/merge-similar-items/
package algorithms.easy.m;

import java.util.ArrayList;
import java.util.List;

public class MergeSimilarItems {
    public static void main(String[] args) {
        MergeSimilarItems similar = new MergeSimilarItems();
        System.out.println("Output:\t" + similar.mergeSimilarItems(new int[][]{{1, 1}, {4, 5}, {3, 8}},
                new int[][]{{3, 1}, {1, 5}}));
        System.out.println("Output:\t" + similar.mergeSimilarItems(new int[][]{{1, 1}, {3, 2}, {2, 3}},
                new int[][]{{2, 1}, {3, 2}, {1, 3}}));
        System.out.println("Output:\t" + similar.mergeSimilarItems(new int[][]{{1, 3}, {2, 2}},
                new int[][]{{7, 1}, {2, 2}, {1, 4}}));
    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] counts = new int[1010];
        List<List<Integer>> answer = new ArrayList<>();

        for (int[] item : items1)
            counts[item[0]] += item[1];
        for (int[] item : items2)
            counts[item[0]] += item[1];
        for (int i = 0; i < counts.length; i++)
            if (counts[i] > 0) answer.add(List.of(i, counts[i]));

        return answer;
    }
}
