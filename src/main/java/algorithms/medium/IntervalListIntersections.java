//https://leetcode.com/problems/interval-list-intersections/
package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public static void main(String[] args) {
        IntervalListIntersections intersect = new IntervalListIntersections();
        System.out.println(
                "Output:\t" + intersect.intervalIntersection(new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                        new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}}));
        System.out.println("Output:\t" + intersect.intervalIntersection(new int[][]{{1, 3}, {5, 9}}, new int[][]{}));
    }

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int aPointer = 0;
        int bPointer = 0;
        List<int[]> list = new ArrayList<>();

        while (aPointer < firstList.length && bPointer < secondList.length) {
            int firstStart = firstList[aPointer][0];
            int firstEnd = firstList[aPointer][1];
            int secondStart = secondList[bPointer][0];
            int secondEnd = secondList[bPointer][1];

            if ((firstStart <= secondEnd) && (secondStart <= firstEnd))
                list.add(new int[]{Math.max(firstStart, secondStart), Math.min(firstEnd, secondEnd)});

            if (firstEnd < secondEnd)
                aPointer++;
            else
                bPointer++;
        }

        return list.toArray(new int[list.size()][2]);
    }
}
