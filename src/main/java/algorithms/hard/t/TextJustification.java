//https://leetcode.com/problems/text-justification/
package algorithms.hard.t;

import java.util.List;
import java.util.ArrayList;

public class TextJustification {
    public static void main(String[] args) {
        TextJustification justify = new TextJustification();
        System.out.println("Output:\t" + justify.fullJustify(
                new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
        System.out.println(
                "Output:\t" + justify.fullJustify(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"},
                        16));
        System.out.println("Output:\t" + justify.fullJustify(
                new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"},
                20));
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justified = new ArrayList<>();
        int index = 0;
        int n = words.length;

        while (index < n) {
            List<String> currentWords = new ArrayList<>();
            currentWords.add(words[index]);
            int currentWidth = words[index].length();
            index++;

            while (index < n && currentWidth + 1 + words[index].length() <= maxWidth) {
                currentWidth += 1 + words[index].length();
                currentWords.add(words[index++]);
            }

            if (index == n || currentWords.size() == 1) {
                String leftAlign = String.join(" ", currentWords);
                String rightPadding = " ".repeat(maxWidth - leftAlign.length());
                justified.add(leftAlign + rightPadding);
                continue;
            }

            int totalSpaces = maxWidth - (currentWidth - currentWords.size() + 1);
            int spaceWidth = totalSpaces / (currentWords.size() - 1);
            int extraSpacesCount = totalSpaces % (currentWords.size() - 1);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < currentWords.size() - 1; i++) {
                sb.append(currentWords.get(i));
                sb.append(" ".repeat(spaceWidth));

                if (i < extraSpacesCount) sb.append(" ");
            }

            sb.append(currentWords.get(currentWords.size() - 1));
            justified.add(sb.toString());
        }

        return justified;
    }
}
