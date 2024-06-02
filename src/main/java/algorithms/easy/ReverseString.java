//https://leetcode.com/problems/reverse-string/description/
package algorithms.easy;

public class ReverseString {

    public static void main(String[] args) {
        char[] wordOne = {'h', 'e', 'l', 'l', 'o'};
        char[] wordTwo = {'H', 'a', 'n', 'n', 'a', 'h'};

        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(wordOne);
        reverseString.reverseString(wordTwo);
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < (s.length / 2); i++) {
            char transition = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = transition;
        }
    }
}
