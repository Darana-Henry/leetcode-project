//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
package algorithms.easy;

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {

        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();

        System.out.println("Output:\t" + gcd.gcdOfStrings("ABCABC", "ABC"));
        System.out.println("Output:\t" + gcd.gcdOfStrings("ABABAB", "ABAB"));
        System.out.println("Output:\t" + gcd.gcdOfStrings("LEET", "CODE"));
    }

    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length())
            return gcdOfStrings(str2, str1);

        if (str1.equals(str2))
            return str2;

        if (str1.startsWith(str2))
            return gcdOfStrings(str1.substring(str2.length()), str2);

        return "";
    }

}
