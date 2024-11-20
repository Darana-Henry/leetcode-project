//https://leetcode.com/problems/second-largest-digit-in-a-string/
package algorithms.easy.s;

public class SecondLargestDigitInAString {
    public static void main(String[] args) {
        SecondLargestDigitInAString second = new SecondLargestDigitInAString();
        System.out.println("Output:\t" + second.secondHighest("dfa12321afd"));
        System.out.println("Output:\t" + second.secondHighest("abc1111"));
    }

    public int secondHighest(String s) {
        int first = -1, second = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int num = ch - '0';

                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num < first) second = num;
            }
        }
        return second;
    }
}
