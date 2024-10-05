//https://leetcode.com/problems/merge-strings-alternately/description
package algorithms.easy.m;

public class MergeStringsAlternately {

    public static void main(String[] args) {

        MergeStringsAlternately mergeStrings = new MergeStringsAlternately();

        System.out.println("Output:\t" + mergeStrings.mergeAlternately("abc", "pqr"));
        System.out.println("Output:\t" + mergeStrings.mergeAlternately("ab", "pqrs"));
        System.out.println("Output:\t" + mergeStrings.mergeAlternately("abcd", "pq"));
    }

    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int count = word1.length() > word2.length() ? word1.length() : word2.length();

        for (int i = 0; i < count; i++) {
            if (i < word1.length())
                result = result + word1.charAt(i);
            if (i < word2.length())
                result = result + word2.charAt(i);
        }
        return result;
    }

    public String mergeAlternatelyFaster(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length())
                result.append(word1.charAt(i));
            if (i < word2.length())
                result.append(word2.charAt(i));
            i++;
        }
        return result.toString();
    }
}
