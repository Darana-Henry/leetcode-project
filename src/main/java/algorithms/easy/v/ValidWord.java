//https://leetcode.com/problems/valid-word/
package algorithms.easy.v;

public class ValidWord {
    public static void main(String[] args) {
        ValidWord valid = new ValidWord();
        System.out.println("Output:\t" + valid.isValid("234Adas"));
        System.out.println("Output:\t" + valid.isValid("b3"));
        System.out.println("Output:\t" + valid.isValid("a3$e"));
    }

    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        int mask = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) return false;
            if ("aeiouAEIOU".contains(ch + "")) mask |= 1;
            else if (Character.isLetter(ch) && !("aeiouAEIOU".contains(ch + ""))) mask |= 2;
        }
        return mask == 3;
    }
}
