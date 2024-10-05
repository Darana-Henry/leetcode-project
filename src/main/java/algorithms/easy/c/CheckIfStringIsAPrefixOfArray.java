//https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/
package algorithms.easy.c;

public class CheckIfStringIsAPrefixOfArray {
    public static void main(String[] args) {
        CheckIfStringIsAPrefixOfArray check = new CheckIfStringIsAPrefixOfArray();
        System.out.println("Output:\t" + check.isPrefixStringOptimized("iloveleetcode",
                new String[]{"i", "love", "leetcode", "apples"}));
        System.out.println("Output:\t" + check.isPrefixStringOptimized("iloveleetcode",
                new String[]{"apples", "i", "love", "leetcode"}));
        System.out.println(
                "Output:\t" + check.isPrefixString("iloveleetcode", new String[]{"i", "love", "leetcode", "apples"}));
        System.out.println(
                "Output:\t" + check.isPrefixString("iloveleetcode", new String[]{"apples", "i", "love", "leetcode"}));
    }

    public boolean isPrefixStringOptimized(String s, String[] words) {
        StringBuilder prefix = new StringBuilder();
        for (String word : words) {
            prefix.append(word);
            if (s.length() == prefix.length()) return s.contentEquals(prefix);
        }
        return false;
    }

    public boolean isPrefixString(String s, String[] words) {
        if (s.indexOf(words[0]) > 0) return false;

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            String str = sb.toString();
            if (s.indexOf(str) == 0) {
                if (str.length() == s.length()) return true;
            }
        }
        return false;
    }
}
