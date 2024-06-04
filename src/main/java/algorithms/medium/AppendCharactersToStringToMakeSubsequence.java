//https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/description/
package algorithms.medium;

public class AppendCharactersToStringToMakeSubsequence {

    public static void main(String[] args) {

        AppendCharactersToStringToMakeSubsequence appendChars = new AppendCharactersToStringToMakeSubsequence();

        System.out.println("Output:\t" + appendChars.appendCharacters("coaching", "coding"));
        System.out.println("Output:\t" + appendChars.appendCharacters("abcde", "a"));
        System.out.println("Output:\t" + appendChars.appendCharacters("z", "abcde"));
        System.out.println("Output:\t" + appendChars.appendCharacters("z", "a"));
    }

    public int appendCharacters(String s, String t) {

        int sIndex = 0;
        int tIndex = 0;

        // Traverse both strings
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }
            sIndex++;
        }

        // Number of unmatched characters in t
        return t.length() - tIndex;
    }
}
