//https://leetcode.com/problems/time-needed-to-rearrange-a-binary-string/
package algorithms.medium.t;

public class TimeNeededToRearrangeABinaryString {
    public static void main(String[] args) {
        TimeNeededToRearrangeABinaryString obj = new TimeNeededToRearrangeABinaryString();
        System.out.println("Output:\t" + obj.secondsToRemoveOccurrences("0110101"));
        System.out.println("Output:\t" + obj.secondsToRemoveOccurrences("11100"));
    }

    public int secondsToRemoveOccurrences(String s) {
        int answer = 0;

        while (s.contains("01")) {
            answer++;
            s = s.replaceAll("01", "10");
        }

        return answer;
    }
}
