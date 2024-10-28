//https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
package algorithms.easy.c;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        CheckIfAllCharactersHaveEqualNumberOfOccurrences occur = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();
        System.out.println("Output:\t" + occur.areOccurrencesEqual("abacbc"));
        System.out.println("Output:\t" + occur.areOccurrencesEqual("aaabb"));
    }

    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];

        for (char ch : s.toCharArray())
            count[ch - 'a']++;

        int target = 0;

        for (int c : count) {
            if (c > 0) {
                if (target == 0) target = c;
                else if (c != target) return false;
            }
        }

        return true;
    }
}
