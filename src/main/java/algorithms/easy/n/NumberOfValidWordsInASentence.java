//https://leetcode.com/problems/number-of-valid-words-in-a-sentence/
package algorithms.easy.n;

public class NumberOfValidWordsInASentence {
    public static void main(String[] args) {
        NumberOfValidWordsInASentence valid = new NumberOfValidWordsInASentence();
        System.out.println("Output:\t" + valid.countValidWords("cat and  dog"));
        System.out.println("Output:\t" + valid.countValidWords("!this  1-s b8d!"));
        System.out.println("Output:\t" + valid.countValidWords("alice and  bob are playing stone-game10"));
    }

    public int countValidWords(String sentence) {
        int answer = 0;

        for (String word : sentence.split(" "))
            if (isValid(word)) answer++;

        return answer;
    }

    private boolean isValid(String word) {
        int length = word.length();
        if (length == 0) return false;
        boolean hyphen = false;

        for (int i = 0; i < length; ++i) {
            char character = word.charAt(i);
            if (Character.isDigit(
                    character) || (i < length - 1 && (character == '!' || character == '.' || character == ',')))
                return false;

            if (character == '-') if (hyphen || i == 0 || i == length - 1 || !Character.isLetter(
                    word.charAt(i - 1)) || !Character.isLetter(word.charAt(i + 1))) return false;

            hyphen = true;
        }
        return true;
    }
}
