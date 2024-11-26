//https://leetcode.com/problems/replace-all-digits-with-characters/
package algorithms.easy.r;

public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        ReplaceAllDigitsWithCharacters replace = new ReplaceAllDigitsWithCharacters();
        System.out.println("Output:\t" + replace.replaceDigits("a1c1e1"));
        System.out.println("Output:\t" + replace.replaceDigits("a1b2c3d4e"));
    }

    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();

        for (int i = 1; i < s.length(); i += 2)
            chars[i] = (char) (chars[i - 1] + (chars[i] - '0'));

        return new String(chars);
    }
}
