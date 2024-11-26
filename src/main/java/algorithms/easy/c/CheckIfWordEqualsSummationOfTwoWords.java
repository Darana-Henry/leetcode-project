//https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
package algorithms.easy.c;

public class CheckIfWordEqualsSummationOfTwoWords {
    public static void main(String[] args) {
        CheckIfWordEqualsSummationOfTwoWords summation = new CheckIfWordEqualsSummationOfTwoWords();
        System.out.println("Output:\t" + summation.isSumEqual("acb", "cba", "cdb"));
        System.out.println("Output:\t" + summation.isSumEqual("aaa", "a", "aab"));
        System.out.println("Output:\t" + summation.isSumEqual("aaa", "a", "aaaa"));
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (convert(firstWord) + convert(secondWord)) == convert(targetWord);
    }

    public int convert(String word) {
        int answer = 0;

        for (char ch : word.toCharArray())
            answer = answer * 10 + (ch - 'a');

        return answer;
    }
}
