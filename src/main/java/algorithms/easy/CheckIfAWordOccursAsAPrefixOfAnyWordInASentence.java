//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
package algorithms.easy;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public static void main(String[] args) {
        CheckIfAWordOccursAsAPrefixOfAnyWordInASentence check = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
        System.out.println("Output:\t" + check.isPrefixOfWord("i love eating burger", "burg"));
        System.out.println("Output:\t" + check.isPrefixOfWord("this problem is an easy problem", "pro"));
        System.out.println("Output:\t" + check.isPrefixOfWord("i am tired", "you"));
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++)
            if (words[i].startsWith(searchWord)) return i + 1;

        return -1;
    }
}
