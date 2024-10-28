//https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/
package algorithms.easy.c;

public class CheckWhetherTwoStringsAreAlmostEquivalent {
    public static void main(String[] args) {
        CheckWhetherTwoStringsAreAlmostEquivalent equivalent = new CheckWhetherTwoStringsAreAlmostEquivalent();
        System.out.println("Output:\t" + equivalent.checkAlmostEquivalent("aaaa", "bccb"));
        System.out.println("Output:\t" + equivalent.checkAlmostEquivalent("abcdeef", "abaaacc"));
        System.out.println("Output:\t" + equivalent.checkAlmostEquivalent("cccddabba", "babababab"));
    }

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] count = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i) - 'a']++;
            count[word2.charAt(i) - 'a']--;
        }

        for (int num : count)
            if (Math.abs(num) > 3) return false;

        return true;
    }
}
