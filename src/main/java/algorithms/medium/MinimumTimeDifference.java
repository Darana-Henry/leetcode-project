//https://leetcode.com/problems/minimum-time-difference/
package algorithms.medium;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class MinimumTimeDifference {
    public static void main(String[] args) {
        MinimumTimeDifference minDiff = new MinimumTimeDifference();
        List<String> ex1 = new ArrayList<>();
        ex1.add("23:59");
        ex1.add("00:00");
        List<String> ex2 = new ArrayList<>();
        ex2.add("00:00");
        ex2.add("23:59");
        ex2.add("00:00");
        System.out.println("Output:\t" + minDiff.findMinDifference(ex1));
        System.out.println("Output:\t" + minDiff.findMinDifference(ex2));
    }

    public int findMinDifference(List<String> timePoints) {
        int max = 24 * 60;
        if (timePoints.size() > max) return 0;

        List<Integer> minutes = new ArrayList<>();
        for (String point : timePoints) {
            String[] time = point.split(":");
            int mins = Integer.valueOf(time[0]) * 60 + Integer.valueOf(time[1]);
            minutes.add(mins);
        }

        Collections.sort(minutes);
        minutes.add(minutes.get(0) + max);
        int minDiff = max;
        for (int i = 1; i < minutes.size(); i++)
            minDiff = Math.min(minDiff, minutes.get(i) - minutes.get(i - 1));

        return minDiff;
    }
}
