//https://leetcode.com/problems/largest-number/
package algorithms.medium.l;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        LargestNumber obj = new LargestNumber();
        System.out.println("Output:\t" + obj.largestNumber(new int[]{10, 2}));
        System.out.println("Output:\t" + obj.largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] s = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++)
            s[i] = Integer.toString(nums[i]);

        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));
        if (s[0].equals("0")) return "0";

        for (String str : s)
            sb.append(str);

        return sb.toString();
    }
}
