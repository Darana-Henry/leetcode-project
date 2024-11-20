//https://leetcode.com/problems/number-of-different-integers-in-a-string/
package algorithms.easy.n;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {
    public static void main(String[] args) {
        NumberOfDifferentIntegersInAString different = new NumberOfDifferentIntegersInAString();
        System.out.println("Output:\t" + different.numDifferentIntegers("a123bc34d8ef34"));
        System.out.println("Output:\t" + different.numDifferentIntegers("leet1234code234"));
        System.out.println("Output:\t" + different.numDifferentIntegers("a1b01c001"));
    }

    public int numDifferentIntegers(String word) {
        int n = word.length();
        Set<String> answer = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(word.charAt(i))) {
                while (i < n && word.charAt(i) == '0') i++;
                int start = i;
                while (start < n && Character.isDigit(word.charAt(start))) start++;
                answer.add(word.substring(i, start));
                i = start;
            }
        }

        return answer.size();
    }
}
