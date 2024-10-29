//https://leetcode.com/problems/reverse-words-in-a-string/description/
package algorithms.medium.r;

public class ReverseWordsInAString {

    public static void main(String[] args) {

        ReverseWordsInAString reverseWords = new ReverseWordsInAString();

        System.out.println("Output:\t" + reverseWords.reverseWords("the sky is blue"));
        System.out.println("Output:\t" + reverseWords.reverseWords("  hello world  "));
        System.out.println("Output:\t" + reverseWords.reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0)
                result.append(' ');
        }
        return result.toString();
    }
}
