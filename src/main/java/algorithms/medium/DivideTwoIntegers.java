//https://leetcode.com/problems/divide-two-integers/description/
package algorithms.medium;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        DivideTwoIntegers divide = new DivideTwoIntegers();
        System.out.println("Output:\t" + divide.divide(10, 3));
        System.out.println("Output:\t" + divide.divide(7, -3));
    }

    public int divide(int dividend, int divisor) {
        if (dividend == 1 << 31 && divisor == -1) return Integer.MAX_VALUE;

        int result = 0;
        boolean sign = (dividend >= 0) == (divisor >= 0) ? true : false;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend - divisor >= 0) {
            int count = 0;
            while (dividend - (divisor << 1 << count) >= 0) count++;
            result += 1 << count;
            dividend -= divisor << count;
        }

        return sign ? result : -result;
    }
}
