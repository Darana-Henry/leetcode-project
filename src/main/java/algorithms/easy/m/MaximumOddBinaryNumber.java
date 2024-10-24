//https://leetcode.com/problems/maximum-odd-binary-number/
package algorithms.easy.m;

public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        MaximumOddBinaryNumber odd = new MaximumOddBinaryNumber();
        System.out.println("Output:\t" + odd.maximumOddBinaryNumber("010"));
        System.out.println("Output:\t" + odd.maximumOddBinaryNumber("0101"));
    }

    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        for (char ch : s.toCharArray())
            if (ch == '1') ones++;
        return "1".repeat(ones - 1) + "0".repeat(s.length() - ones) + "1";
    }
}
