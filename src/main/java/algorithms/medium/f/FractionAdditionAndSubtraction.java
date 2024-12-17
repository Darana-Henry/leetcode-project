//https://leetcode.com/problems/fraction-addition-and-subtraction/
package algorithms.medium.f;

public class FractionAdditionAndSubtraction {
    public static void main(String[] args) {
        FractionAdditionAndSubtraction obj = new FractionAdditionAndSubtraction();
        System.out.println("Output:\t" + obj.fractionAddition("-1/2+1/2"));
        System.out.println("Output:\t" + obj.fractionAddition("-1/2+1/2+1/3"));
        System.out.println("Output:\t" + obj.fractionAddition("1/3-1/2"));
    }

    public String fractionAddition(String expression) {
        int numerator = 0, common = 6 * 7 * 8 * 9 * 10;
        if (Character.isDigit(expression.charAt(0))) expression = "+" + expression;
        int i = 0;
        int len = expression.length();

        while (i < len) {
            int sign = expression.charAt(i) == '-' ? -1 : 1;
            i++;

            int j = i;
            while (j < len && expression.charAt(j) != '+' && expression.charAt(j) != '-') {
                j++;
            }

            String str = expression.substring(i, j);
            String[] parts = str.split("/");
            int num = Integer.parseInt(parts[0]);
            int denom = Integer.parseInt(parts[1]);
            numerator += sign * num * common / denom;
            i = j;
        }

        int gcomd = gcd(Math.abs(numerator), common);
        numerator /= gcomd;
        common /= gcomd;

        return numerator + "/" + common;

    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
