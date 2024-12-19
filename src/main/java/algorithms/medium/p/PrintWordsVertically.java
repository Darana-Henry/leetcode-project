//https://leetcode.com/problems/print-words-vertically/
package algorithms.medium.p;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {
    public static void main(String[] args) {
        PrintWordsVertically obj = new PrintWordsVertically();
        System.out.println("Output:\t" + obj.printVertically("HOW ARE YOU"));
        System.out.println("Output:\t" + obj.printVertically("TO BE OR NOT TO BE"));
        System.out.println("Output:\t" + obj.printVertically("CONTEST IS COMING"));
    }

    public List<String> printVertically(String s) {
        int max = 0;
        String[] parts = s.split(" ");
        List<String> answer = new ArrayList<>();

        for (String part : parts)
            max = Math.max(max, part.length());

        for (int i = 0; i < max; i++) {
            StringBuilder sb = new StringBuilder();

            for (String part : parts)
                sb.append(i < part.length() ? part.charAt(i) : ' ');

            while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
                sb.deleteCharAt(sb.length() - 1);
            }

            answer.add(sb.toString());
        }

        return answer;
    }
}
