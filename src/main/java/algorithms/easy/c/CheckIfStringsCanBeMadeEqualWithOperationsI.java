//https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i/
package algorithms.easy.c;

public class CheckIfStringsCanBeMadeEqualWithOperationsI {
    public static void main(String[] args) {
        CheckIfStringsCanBeMadeEqualWithOperationsI madeEqual = new CheckIfStringsCanBeMadeEqualWithOperationsI();
        System.out.println("Output:\t" + madeEqual.canBeEqual("abcd", "cdab"));
        System.out.println("Output:\t" + madeEqual.canBeEqual("abcd", "dacb"));
    }

    public boolean canBeEqual(String s1, String s2) {
        return (s1.charAt(0) == s2.charAt(0) || s1.charAt(0) == s2.charAt(2)) && (s1.charAt(1) == s2.charAt(
                1) || s1.charAt(1) == s2.charAt(3)) && (s1.charAt(2) == s2.charAt(2) || s1.charAt(2) == s2.charAt(
                0)) && (s1.charAt(3) == s2.charAt(3) || s1.charAt(3) == s2.charAt(1));
    }
}
