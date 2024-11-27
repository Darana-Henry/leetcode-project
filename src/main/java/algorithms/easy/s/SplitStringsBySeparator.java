//https://leetcode.com/problems/split-strings-by-separator/
package algorithms.easy.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStringsBySeparator {
    public static void main(String[] args) {
        SplitStringsBySeparator separator = new SplitStringsBySeparator();
        System.out.println(
                "Output:\t" + separator.splitWordsBySeparator(Arrays.asList("one.two.three", "four.five", "six"), '.'));
        System.out.println("Output:\t" + separator.splitWordsBySeparator(Arrays.asList("$easy$", "$problem$"), '$'));
        System.out.println("Output:\t" + separator.splitWordsBySeparator(List.of("|||"), '|'));
        System.out.println(
                "Output:\t" + separator.splitWordsBySeparatorOther(Arrays.asList("one.two.three", "four.five", "six"),
                        '.'));
        System.out.println(
                "Output:\t" + separator.splitWordsBySeparatorOther(Arrays.asList("$easy$", "$problem$"), '$'));
        System.out.println("Output:\t" + separator.splitWordsBySeparatorOther(List.of("|||"), '|'));
    }

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> answer = new ArrayList<>();

        for (String word : words) {
            String[] parts = word.split("\\Q" + separator + "\\E");
            for (String part : parts)
                if (!part.isEmpty()) answer.add(part);
        }

        return answer;
    }

    public List<String> splitWordsBySeparatorOther(List<String> words, char separator) {
        List<String> answer = new ArrayList<>();

        for (String word : words) {
            String[] parts = word.split("[" + separator + "]");
            for (String part : parts)
                if (part.length() > 0) answer.add(part);
        }

        return answer;
    }
}
