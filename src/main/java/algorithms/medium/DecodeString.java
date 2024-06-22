//https://leetcode.com/problems/decode-string/submissions/1296338918/
package algorithms.medium;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        System.out.println("Output:\t" + decodeString.decodeString("3[a]2[bc]"));
        System.out.println("Output:\t" + decodeString.decodeString("3[a2[c]]"));
        System.out.println("Output:\t" + decodeString.decodeString("2[abc]3[cd]ef"));
    }

    public String decodeString(String s) {
        Stack<String> words = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        String result = "";
        int index = 0;

        while (index < s.length()) {

            if (Character.isDigit(s.charAt(index))) {
                int count = 0;

                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index)) - '0';
                    index++;
                }
                counts.push(count);

            } else if (s.charAt(index) == '[') {
                words.push(result);
                result = "";
                index++;

            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(words.pop());
                int count = counts.pop();

                for (int i = 0; i < count; i++)
                    temp.append(result);

                result = temp.toString();
                index++;

            } else {
                result += s.charAt(index);
                index++;
            }
        }
        return result;
    }
}
