//https://leetcode.com/problems/reverse-only-letters/
package algorithms.easy;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        ReverseOnlyLetters reversed = new ReverseOnlyLetters();
        System.out.println("Output:\t" + reversed.reverseOnlyLettersOptimized("ab-cd"));
        System.out.println("Output:\t" + reversed.reverseOnlyLettersOptimized("a-bC-dEf-ghIj"));
        System.out.println("Output:\t" + reversed.reverseOnlyLettersOptimized("Test1ng-Leet=code-Q!"));
        System.out.println("Output:\t" + reversed.reverseOnlyLetters("ab-cd"));
        System.out.println("Output:\t" + reversed.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println("Output:\t" + reversed.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public String reverseOnlyLettersOptimized(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) left++;
            while (left < right && !Character.isLetter(chars[right])) right--;
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) sb.append(ch);
        }

        sb.reverse();
        int index = 0;
        StringBuilder reversed = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) reversed.append(sb.charAt(index++));
            else reversed.append(ch);
        }


        return reversed.toString();
    }
}
