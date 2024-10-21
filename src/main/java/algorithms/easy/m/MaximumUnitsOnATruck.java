//https://leetcode.com/problems/maximum-units-on-a-truck/
package algorithms.easy.m;

import java.util.Arrays;

public class MaximumUnitsOnATruck {
    public static void main(String[] args) {
        MaximumUnitsOnATruck truck = new MaximumUnitsOnATruck();
        System.out.println("Output:\t" + truck.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
        System.out.println("Output:\t" + truck.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int answer = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        for (int[] box : boxTypes) {
            answer += box[1] * Math.min(truckSize, box[0]);
            truckSize -= box[0];
            if (truckSize <= 0) break;
        }

        return answer;
    }
}
