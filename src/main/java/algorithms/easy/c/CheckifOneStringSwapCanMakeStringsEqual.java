//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
package algorithms.easy.c;

public class CheckifOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        CheckifOneStringSwapCanMakeStringsEqual equal = new CheckifOneStringSwapCanMakeStringsEqual();
        System.out.println("Output:\t" + equal.areAlmostEqual("bank", "kanb"));
        System.out.println("Output:\t" + equal.areAlmostEqual("attack", "defend"));
        System.out.println("Output:\t" + equal.areAlmostEqual("kelb", "kelb"));
    }

    public boolean areAlmostEqual(String s1, String s2) {
        int diff = 0;
        char chars1 = 0, chars2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if (c1 != c2) {
                if (++diff > 2 || (diff == 2 && !(chars1 == c2 && chars2 == c1))) return false;
                chars1 = c1;
                chars2 = c2;
            }
        }
        return diff != 1;
    }
}
