//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
package algorithms.easy.c;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        CheckIfTwoStringArraysAreEquivalent equivalent = new CheckIfTwoStringArraysAreEquivalent();
        System.out.println(
                "Output:\t" + equivalent.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(
                "Output:\t" + equivalent.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        System.out.println("Output:\t" + equivalent.arrayStringsAreEqual(new String[]{"abc", "d", "defg"},
                new String[]{"abcddefg"}));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordA = String.join("", word1);
        String wordB = String.join("", word2);
        return wordA.equals(wordB);
    }
}
