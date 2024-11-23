//https://leetcode.com/problems/occurrences-after-bigram/
package algorithms.easy.o;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {
    public static void main(String[] args) {
        OccurrencesAfterBigram bigram = new OccurrencesAfterBigram();
        System.out.println(
                "Output:\t" + bigram.findOcurrences("alice is a good girl she is a good student", "a", "good"));
        System.out.println("Output:\t" + bigram.findOcurrences("we will we will rock you", "we", "will"));
    }

    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < words.length - 2; i++)
            if (words[i].equals(first) && words[i + 1].equals(second)) answer.add(words[i + 2]);

        return answer.toArray(new String[0]);
    }
}

