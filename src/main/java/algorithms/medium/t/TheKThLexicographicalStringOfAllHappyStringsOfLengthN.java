//https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/
package algorithms.medium.t;

import java.util.ArrayList;
import java.util.List;

public class TheKThLexicographicalStringOfAllHappyStringsOfLengthN {
    int n;
    List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        TheKThLexicographicalStringOfAllHappyStringsOfLengthN obj = new TheKThLexicographicalStringOfAllHappyStringsOfLengthN();
        System.out.println("Output:\t" + obj.getHappyStringCombinatorics(1, 3));
        System.out.println("Output:\t" + obj.getHappyStringCombinatorics(1, 4));
        System.out.println("Output:\t" + obj.getHappyStringCombinatorics(3, 9));
        System.out.println("Output:\t" + obj.getHappyStringBackTrack(1, 3));
        System.out.println("Output:\t" + obj.getHappyStringBackTrack(1, 4));
        System.out.println("Output:\t" + obj.getHappyStringBackTrack(3, 9));
    }

    public String getHappyStringCombinatorics(int n, int k) {
        int total = 3 * (1 << (n - 1));
        if (total < k) return "";

        StringBuilder sb = new StringBuilder();
        String choices = "abc";
        int left = 1, right = total;

        for (int i = 0; i < n; i++) {
            int curr = left;
            int bloc = (right - left + 1) / choices.length();

            for (char ch : choices.toCharArray()) {
                if (k >= curr && k < (curr + bloc)) {
                    sb.append(ch);
                    left = curr;
                    right = curr + bloc - 1;
                    choices = "abc".replace(ch + "", "");
                }
                curr += bloc;
            }
        }
        return sb.toString();
    }

    public String getHappyStringBackTrack(int n, int k) {
        this.n = n;
        backtrack("");
        return list.size() < k ? "" : list.get(k - 1);
    }

    public void backtrack(String s) {
        if (s.length() == n) {
            list.add(s);
            return;
        }

        for (char ch : "abc".toCharArray()) {
            if (s.length() > 0 && s.charAt(s.length() - 1) == ch) continue;
            backtrack(s + ch);
        }
    }
}
