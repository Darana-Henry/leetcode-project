//https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/
package algorithms.easy.m;

public class MaximumDifferenceByRemappingADigit {
    public static void main(String[] args) {
        MaximumDifferenceByRemappingADigit maxDiff = new MaximumDifferenceByRemappingADigit();
        System.out.println("Output:\t" + maxDiff.minMaxDifference(11891));
        System.out.println("Output:\t" + maxDiff.minMaxDifference(90));
    }

    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int min = Integer.valueOf(s.replace(s.charAt(0), '0'));

        for (char ch : s.toCharArray())
            if (ch != '9') return Integer.valueOf(s.replace(ch, '9')) - min;

        return num - min;
    }
}
