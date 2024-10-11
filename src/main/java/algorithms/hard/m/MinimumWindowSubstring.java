//https://leetcode.com/problems/minimum-window-substring/
package algorithms.hard.m;


public class MinimumWindowSubstring {
    public static void main(String[] args) {
        MinimumWindowSubstring minWindow = new MinimumWindowSubstring();
        System.out.println("Output:\t" + minWindow.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println("Output:\t" + minWindow.minWindow("a", "a"));
        System.out.println("Output:\t" + minWindow.minWindow("a", "aa"));
    }

    public String minWindow(String s, String t) {
        int[] charFreqTar = new int[128];
        int[] charFreqWindow = new int[128];
        int sourceLen = s.length();
        int targetLen = t.length();

        for (char ch : t.toCharArray())
            charFreqTar[ch]++;

        int matchCount = 0;
        int start = 0;
        int minStart = -1;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < sourceLen; end++) {
            charFreqWindow[s.charAt(end)]++;
            if (charFreqTar[s.charAt(end)] >= charFreqWindow[s.charAt(end)]) matchCount++;

            while (matchCount == targetLen) {
                int windowLen = end - start + 1;
                if (windowLen < minLen) {
                    minStart = start;
                    minLen = windowLen;
                }

                char startChar = s.charAt(start);
                if (charFreqTar[startChar] >= charFreqWindow[startChar]) matchCount--;

                charFreqWindow[startChar]--;
                start++;
            }
        }
        return minStart < 0 ? "" : s.substring(minStart, minStart + minLen);

    }
}
