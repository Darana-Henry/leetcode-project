//https://leetcode.com/problems/removing-stars-from-a-string/description/
package algorithms.medium;

import java.util.Iterator;
import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        RemovingStarsFromAString removeStars = new RemovingStarsFromAString();
        System.out.println("Output:\t" + removeStars.removeStarsWithStack("leet**cod*e"));
        System.out.println("Output:\t" + removeStars.removeStarsWithStringBuilder("erase*****"));
    }

    public String removeStarsWithStack(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*')
                stack.pop();
            else
                stack.add(ch);
        }

        Iterator value = stack.iterator();
        while (value.hasNext()) {
            result.append(value.next());
        }

        return result.toString();
    }

    public String removeStarsWithStringBuilder(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray())
            if (c == '*')
                res.setLength(res.length() - 1);
            else
                res.append(c);
        return res.toString();
    }
}
