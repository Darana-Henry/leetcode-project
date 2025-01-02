//https://leetcode.com/problems/count-vowel-strings-in-ranges/
package algorithms.medium.c;

public class CountVowelStringsInRanges {
    public static void main(String[] args) {
        CountVowelStringsInRanges obj = new CountVowelStringsInRanges();
        System.out.println("Output:\t" + obj.vowelStrings(new String[]{"aba", "bcb", "ece", "aa", "e"},
                new int[][]{{0, 2}, {1, 4}, {1, 1}}));
        System.out.println(
                "Output:\t" + obj.vowelStrings(new String[]{"a", "e", "i"}, new int[][]{{0, 2}, {0, 1}, {2, 2}}));
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int w = words.length;
        int q = queries.length;
        int[] prefix = new int[w + 1];
        int[] answer = new int[q];

        for (int i = 0; i < w; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1)))
                prefix[i + 1] = prefix[i] + 1;
            else prefix[i + 1] = prefix[i];
        }

        for (int i = 0; i < q; i++)
            answer[i] = prefix[queries[i][1] + 1] - prefix[queries[i][0]];


        return answer;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
