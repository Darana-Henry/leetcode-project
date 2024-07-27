//https://leetcode.com/problems/zigzag-conversion/description/
package algorithms.medium;


import java.util.Arrays;

public class ZigzagConversion {
    public static void main(String[] args) {
        ZigzagConversion zigzag = new ZigzagConversion();
        System.out.println("Output:\t" + zigzag.convert("PAYPALISHIRING", 3));
        System.out.println("Output:\t" + zigzag.convertOptimized("PAYPALISHIRING", 4));
        System.out.println("Output:\t" + zigzag.convert("A", 1));
    }

    public String convert(String s, int numRows) {
        String[] st = new String[numRows];
        Arrays.fill(st, "");
        StringBuilder sb = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            for (int i = 0; i < numRows && index < s.length(); i++)
                st[i] += s.charAt(index++) + "";

            for (int i = numRows - 2; i > 0 && index < s.length(); i--)
                st[i] += s.charAt(index++) + "";

        }

        for (String str : st)
            sb.append(str);

        return sb.toString();
    }

    public String convertOptimized(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= numRows; i++) {
            int ind = i - 1;
            boolean up = true;
            while (ind < s.length()) {
                builder.append(s.charAt(ind));
                if (i == 1) {
                    ind += 2 * (numRows - i);
                } else if (i == numRows) {
                    ind += 2 * (i - 1);
                } else {
                    ind += up ? 2 * (numRows - i) : 2 * (i - 1);
                    up = !up;
                }
            }
        }
        return builder.toString();
    }
}
