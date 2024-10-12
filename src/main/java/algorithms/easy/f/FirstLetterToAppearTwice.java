//https://leetcode.com/problems/first-letter-to-appear-twice/
package algorithms.easy.f;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        FirstLetterToAppearTwice letter = new FirstLetterToAppearTwice();
        System.out.println("Output:\t" + letter.repeatedCharacter("abccbaacz"));
        System.out.println("Output:\t" + letter.repeatedCharacter("abcdd"));
    }

    public char repeatedCharacter(String s) {
        int mask = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int pos = ch - 'a';
            if ((mask & (1 << pos)) != 0) return ch;
            mask |= 1 << pos;
        }
        return '\0';
    }
}
