//https://leetcode.com/problems/is-subsequence/description/
package algorithms.easy;

public class IsSubsequence {

    public static void main(String[] args) {

        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println("Output:\t" + isSubsequence.isSubsequenceMethodA("abc", "ahbgdc"));
        System.out.println("Output:\t" + isSubsequence.isSubsequenceMethodB("axc", "ahbgdc"));
    }

    public boolean isSubsequenceMethodA(String s, String t) {
        if (s.length() == 0)
            return true;

        int indexS = 0;

        for (char c : t.toCharArray()) {
            if (c == s.charAt(indexS) && indexS < s.length()) {
                indexS++;
            }
            if (indexS == s.length() && indexS != 0)
                return true;
        }
        return false;
    }

    public boolean isSubsequenceMethodB(String s, String t) {
        if (s.length() == 0)
            return true;

        int sPointer = 0;
        int tPointer = 0;

        while (tPointer < t.length()) {
            if (t.charAt(tPointer) == s.charAt(sPointer))
                sPointer++;
            if (sPointer == t.length())
                return true;
            tPointer++;
        }
        return false;
    }
}
