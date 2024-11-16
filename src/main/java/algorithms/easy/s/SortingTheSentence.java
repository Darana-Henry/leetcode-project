//https://leetcode.com/problems/sorting-the-sentence/
package algorithms.easy.s;

public class SortingTheSentence {
    public static void main(String[] args) {
        SortingTheSentence sentence = new SortingTheSentence();
        System.out.println("Output:\t" + sentence.sortSentence("is2 sentence4 This1 a3"));
        System.out.println("Output:\t" + sentence.sortSentence("Myself2 Me1 I4 and3"));
    }

    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];

        for (String word : words) {
            int i = word.charAt(word.length() - 1) - '1';
            sorted[i] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", sorted);
    }
}
