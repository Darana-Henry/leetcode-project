//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
package algorithms.medium;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber combo = new LetterCombinationsOfAPhoneNumber();
        System.out.println("Output:\t" + combo.letterCombinations("23"));
        System.out.println("Output:\t" + combo.letterCombinations(""));
        System.out.println("Output:\t" + combo.letterCombinations("2"));
    }

    public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<>();
        String[] charsMap = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (digits.length() == 0)
            return list;

        list.add("");

        for (int i = 0; i < digits.length(); i++) {
            int num = digits.charAt(i) - '0';
            while (list.peek().length() == i) {
                String s = list.pop();
                for (char ch : charsMap[num].toCharArray())
                    list.add(s + ch);
            }

        }
        return list;
    }
}
