//https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/
package algorithms.medium.m;

public class MinimumNumberOfChangesToMakeBinaryStringBeautiful {
    public static void main(String[] args) {
        MinimumNumberOfChangesToMakeBinaryStringBeautiful obj = new MinimumNumberOfChangesToMakeBinaryStringBeautiful();
        System.out.println("Output:\t" + obj.minChanges("1001"));
        System.out.println("Output:\t" + obj.minChanges("10"));
        System.out.println("Output:\t" + obj.minChanges("0000"));
    }

    public int minChanges(String s) {
        int answer = 0;

        for (int i = 1; i < s.length(); i += 2)
            if (s.charAt(i) != s.charAt(i - 1)) answer++;

        return answer;
    }
}
