//https://leetcode.com/problems/find-words-containing-character/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        FindWordsContainingCharacter find = new FindWordsContainingCharacter();
        System.out.println("Output:\t" + find.findWordsContaining(new String[]{"leet", "code"}, 'e'));
        System.out.println("Output:\t" + find.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a'));
        System.out.println("Output:\t" + find.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z'));
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            if (words[i].contains(x + "")) answer.add(i);
        return answer;
    }
}
