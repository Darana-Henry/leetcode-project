//https://leetcode.com/problems/multiply-strings/
package algorithms.medium.m;

public class MultiplyStrings {
    public static void main(String[] args) {
        MultiplyStrings multiply = new MultiplyStrings();
        System.out.println("Output:\t" + multiply.multiply("2", "3"));
        System.out.println("Output:\t" + multiply.multiply("123", "456"));
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length();
        int n = num2.length();
        int[] nums = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                nums[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i - 1] += nums[i] / 10;
            nums[i] %= 10;
        }

        int index = nums[0] == 0 ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        for (int i = index; i < nums.length; i++)
            sb.append(nums[i]);
        return sb.toString();
    }
}
