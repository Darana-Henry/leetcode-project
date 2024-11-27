//https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/
package algorithms.easy.m;

public class MaximumValueOfAStringInAnArray {
    public static void main(String[] args) {
        MaximumValueOfAStringInAnArray maxVal = new MaximumValueOfAStringInAnArray();
        System.out.println("Output:\t" + maxVal.maximumValue(new String[]{"alic3", "bob", "3", "4", "00000"}));
        System.out.println("Output:\t" + maxVal.maximumValue(new String[]{"1", "01", "001", "0001"}));
    }

    public int maximumValue(String[] strs) {
        int max = 0;

        for (String s : strs) {
            int len = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLetter(ch)) {
                    len = s.length();
                    break;
                } else len = len * 10 + (ch - '0');
            }
            max = Math.max(max, len);
        }

        return max;
    }
}
