//https://leetcode.com/problems/maximum-score-after-splitting-a-string/
package algorithms.easy.m;

public class MaximumScoreAfterSplittingAString {
    public static void main(String[] args) {
        MaximumScoreAfterSplittingAString split = new MaximumScoreAfterSplittingAString();
        System.out.println("Output:\t" + split.maxScore("011101"));
        System.out.println("Output:\t" + split.maxScore("00111"));
        System.out.println("Output:\t" + split.maxScore("1111"));
    }

    public int maxScore(String s) {
        int total = 0;
        if (s.charAt(0) == '0') total++;

        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == '1') total++;


        int max = total;
        for (int i = 1; i < s.length() - 1; i++) {
            total += (s.charAt(i) == '0') ? 1 : -1;
            max = Math.max(max, total);
        }

        return max;
    }
}
