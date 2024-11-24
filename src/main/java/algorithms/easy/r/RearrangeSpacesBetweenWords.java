//https://leetcode.com/problems/rearrange-spaces-between-words/
package algorithms.easy.r;

import java.util.ArrayList;
import java.util.List;

public class RearrangeSpacesBetweenWords {
    public static void main(String[] args) {
        RearrangeSpacesBetweenWords between = new RearrangeSpacesBetweenWords();
        System.out.println("Output:\t" + between.reorderSpaces("  this   is  a sentence "));
        System.out.println("Output:\t" + between.reorderSpaces(" practice   makes   perfect"));
    }

    public String reorderSpaces(String text) {
        int spaces = 0;

        for (char ch : text.toCharArray())
            if (ch == ' ') spaces++;

        String[] words = text.trim().split("\\s+");
        List<String> list = new ArrayList<>();

        for (String word : words)
            if (!word.isEmpty()) list.add(word);

        int gaps = list.size() - 1;
        if (gaps == 0) return list.get(0) + " ".repeat(spaces);
        int betweenSpaces = spaces / gaps;
        int endSpaces = spaces % gaps;
        String answer = String.join(" ".repeat(betweenSpaces), list);
        answer += " ".repeat(endSpaces);
        return answer;
    }
}
