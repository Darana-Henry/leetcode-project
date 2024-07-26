//https://leetcode.com/problems/add-strings/
package algorithms.easy;

public class AddStrings {
    public static void main(String[] args) {
        AddStrings addStrings = new AddStrings();
        System.out.println("Output:\t" + addStrings.addStringsBruteForce("11", "123"));
        System.out.println("Output:\t" + addStrings.addStringsOptimized("456", "77"));
        System.out.println("Output:\t" + addStrings.addStringsOptimized("0", "0"));
    }

    public String addStringsBruteForce(String num1, String num2) {
        int sum = 0;
        int num = 0;
        for (char ch : num1.toCharArray())
            num = num * 10 + (ch - '0');

        sum += num;
        num = 0;
        for (char ch : num2.toCharArray())
            num = num * 10 + (ch - '0');

        sum += num;
        return sum + "";
    }

    public String addStringsOptimized(String num1, String num2) {
        int sum, carry = 0;
        int n1s = num1.length() - 1;
        int n2s = num2.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (n1s >= 0 || n2s >= 0 || carry > 0) {
            int n1 = n1s >= 0 ? num1.charAt(n1s--) - '0' : 0;
            int n2 = n2s >= 0 ? num2.charAt(n2s--) - '0' : 0;

            sum = n1 + n2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}

