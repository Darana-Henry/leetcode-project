//https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/
package algorithms.medium.m;

public class MakeStringASubsequenceUsingCyclicIncrements {
    public static void main(String[] args) {
        MakeStringASubsequenceUsingCyclicIncrements makeStringASubsequenceUsingCyclicIncrements = new MakeStringASubsequenceUsingCyclicIncrements();
        System.out.println("Output:\t" + makeStringASubsequenceUsingCyclicIncrements.canMakeSubsequence("abc", "ad"));
        System.out.println("Output:\t" + makeStringASubsequenceUsingCyclicIncrements.canMakeSubsequence("zc", "ad"));
        System.out.println("Output:\t" + makeStringASubsequenceUsingCyclicIncrements.canMakeSubsequence("ab", "d"));
    }

    public boolean canMakeSubsequence(String str1, String str2) {
        int index = 0, n = str2.length();
        for (char ch : str1.toCharArray()) {
            char next = ch == 'z' ? 'a' : (char) (ch + 1);
            if (index < n && (ch == str2.charAt(index) || next == str2.charAt(index))) index++;
        }
        return index == n;
    }
}
