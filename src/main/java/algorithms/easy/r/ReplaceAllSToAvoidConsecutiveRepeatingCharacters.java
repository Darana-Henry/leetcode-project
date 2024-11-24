//https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/
package algorithms.easy.r;

public class ReplaceAllSToAvoidConsecutiveRepeatingCharacters {
    public static void main(String[] args) {
        ReplaceAllSToAvoidConsecutiveRepeatingCharacters avoid = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        System.out.println("Output:\t" + avoid.modifyString("?zs"));
        System.out.println("Output:\t" + avoid.modifyString("ubv?w"));
    }

    public String modifyString(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (chars[i] == '?') {
                for (char ch = 'a'; ch <= 'c'; ch++) {
                    if ((i > 0 && chars[i - 1] == ch) || (i + 1 < n && chars[i + 1] == ch)) continue;
                    chars[i] = ch;
                    break;
                }
            }
        }

        return new String(chars);
    }
}
