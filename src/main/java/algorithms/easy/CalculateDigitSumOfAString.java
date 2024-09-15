//https://leetcode.com/problems/calculate-digit-sum-of-a-string/
package algorithms.easy;

public class CalculateDigitSumOfAString {
    public static void main(String[] args) {
        CalculateDigitSumOfAString digitSum = new CalculateDigitSumOfAString();
        System.out.println("Output:\t" + digitSum.digitSum("11111222223", 3));
        System.out.println("Output:\t" + digitSum.digitSum("00000000", 3));
    }

    public String digitSum(String s, int k) {
        while (s.length() > k) {
            int n = s.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i += k) {
                int sum = 0;
                for (int j = i; j < Math.min(i + k, n); j++)
                    sum += (s.charAt(j) - '0');
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s;
    }
}
