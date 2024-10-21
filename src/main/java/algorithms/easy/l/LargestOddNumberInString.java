//https://leetcode.com/problems/largest-odd-number-in-string/
package algorithms.easy.l;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        LargestOddNumberInString largest = new LargestOddNumberInString();
        System.out.println("Output:\t" + largest.largestOddNumber("52"));
        System.out.println("Output:\t" + largest.largestOddNumber("4206"));
        System.out.println("Output:\t" + largest.largestOddNumber("35427"));
    }

    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--)
            if (((num.charAt(i) - '0') & 1) == 1) return num.substring(0, i + 1);
        return "";
    }
}
