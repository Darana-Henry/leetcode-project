//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
package algorithms.easy.m;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        MaximumNumberOfWordsFoundInSentences words = new MaximumNumberOfWordsFoundInSentences();
        System.out.println("Output:\t" + words.mostWordsFound(
                new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        System.out.println("Output:\t" + words.mostWordsFound(
                new String[]{"please wait", "continue to fight", "continue to win"}));
    }

    public int mostWordsFound(String[] sentences) {
        int answer = 0;
        for (String sentence : sentences)
            answer = Math.max(answer, sentence.split(" ").length);
        return answer;
    }
}
