//https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/
package algorithms.easy.m;

public class MinimumNumberOfOperationsToConvertTime {
    public static void main(String[] args) {
        MinimumNumberOfOperationsToConvertTime convert = new MinimumNumberOfOperationsToConvertTime();
        System.out.println("Output:\t" + convert.convertTime("02:30", "04:35"));
        System.out.println("Output:\t" + convert.convertTime("11:00", "11:01"));
    }

    public int convertTime(String current, String correct) {
        int currMins = Integer.valueOf(current.substring(0, 2)) * 60 + Integer.valueOf(current.substring(3));
        int corrMins = Integer.valueOf(correct.substring(0, 2)) * 60 + Integer.valueOf(correct.substring(3));
        int diff = corrMins - currMins;
        int[] ops = new int[]{60, 15, 5, 1};
        int answer = 0;

        for (int op : ops) {
            answer += diff / op;
            diff %= op;
        }

        return answer;
    }
}
