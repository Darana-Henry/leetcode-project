//https://leetcode.com/problems/minimum-absolute-difference/
package algorithms.easy.m;

import algorithms.easy.r.RankTransformOfAnArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        RankTransformOfAnArray ranks = new RankTransformOfAnArray();
        System.out.println("Output:\t" + ranks.arrayRankTransform(new int[]{4, 2, 1, 3}));
        System.out.println("Output:\t" + ranks.arrayRankTransform(new int[]{1, 3, 6, 10, 15}));
        System.out.println("Output:\t" + ranks.arrayRankTransform(new int[]{3, 8, -10, 23, 19, -4, -14, 27}));
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++)
            min = Math.min(min, arr[i + 1] - arr[i]);

        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i + 1] - arr[i] == min) answer.add(List.of(arr[i], arr[i + 1]));

        return answer;
    }
}
