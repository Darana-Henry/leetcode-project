//https://leetcode.com/problems/existence-of-a-substring-in-a-string-and-its-reverse/
package algorithms.easy.e;

public class ExistenceOfASubstringInAStringAndItsReverse {
    public static void main(String[] args) {
        ExistenceOfASubstringInAStringAndItsReverse existence = new ExistenceOfASubstringInAStringAndItsReverse();
        System.out.println("Output:\t" + existence.isSubstringPresent("leetcode"));
        System.out.println("Output:\t" + existence.isSubstringPresent("abcba"));
        System.out.println("Output:\t" + existence.isSubstringPresent("abcd"));
    }

    public boolean isSubstringPresent(String s) {
        for (int i = 0; i < s.length() - 1; i++)
            if (s.contains(s.charAt(i + 1) + "" + s.charAt(i))) return true;
        return false;
    }
}
