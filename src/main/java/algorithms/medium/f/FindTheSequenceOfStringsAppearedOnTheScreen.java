//https://leetcode.com/problems/find-the-sequence-of-strings-appeared-on-the-screen/
package algorithms.medium.f;

import java.util.ArrayList;
import java.util.List;

public class FindTheSequenceOfStringsAppearedOnTheScreen {
    public static void main(String[] args) {
        FindTheSequenceOfStringsAppearedOnTheScreen obj = new FindTheSequenceOfStringsAppearedOnTheScreen();
        System.out.println("Output:\t" + obj.stringSequence("abc"));
        System.out.println("Output:\t" + obj.stringSequence("he"));
    }

    public List<String> stringSequence(String target) {
        List<String> answer = new ArrayList<>();

        for (char ch : target.toCharArray()) {
            String prev = answer.isEmpty() ? "" : answer.get(answer.size() - 1);

            for (char c = 'a'; c <= ch; c++)
                answer.add(prev + c);
        }

        return answer;
    }
}
