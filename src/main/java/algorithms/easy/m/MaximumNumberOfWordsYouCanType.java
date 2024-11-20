//https://leetcode.com/problems/maximum-number-of-words-you-can-type/
package algorithms.easy.m;

public class MaximumNumberOfWordsYouCanType {
    public static void main(String[] args) {
        MaximumNumberOfWordsYouCanType words = new MaximumNumberOfWordsYouCanType();
        System.out.println("Output:\t" + words.canBeTypedWords("hello world", "ad"));
        System.out.println("Output:\t" + words.canBeTypedWords("leet code", "lt"));
        System.out.println("Output:\t" + words.canBeTypedWords("leet code", "e"));
    }

    public int canBeTypedWords(String text, String brokenLetters) {
        int answer = 0;
        boolean[] broken = new boolean[26];

        for (char ch : brokenLetters.toCharArray())
            broken[ch - 'a'] = true;

        for (String word : text.split(" ")) {
            boolean yes = true;

            for (char ch : word.toCharArray()) {
                if (broken[ch - 'a']) {
                    yes = false;
                    break;
                }
            }

            if (yes) answer++;
        }

        return answer;
    }
}
