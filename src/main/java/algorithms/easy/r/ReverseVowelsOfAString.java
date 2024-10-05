//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
package algorithms.easy.r;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {

        ReverseVowelsOfAString reverseVowels = new ReverseVowelsOfAString();

        System.out.println("Output:\t" + reverseVowels.reverseVowels("hello"));
        System.out.println("Output:\t" + reverseVowels.reverseVowels("leetcode"));
    }

    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int left = 0;
        int right = s.length() - 1;
        char[] ch = s.toCharArray();

        while (left < right) {
            while (left < right && !vowels.contains(ch[left]))
                left++;

            while (left < right && !vowels.contains(ch[right]))
                right--;

            ch[left] = s.charAt(right);
            ch[right] = s.charAt(left);

            left++;
            right--;
        }
        return new String(ch);
    }
}
