//https://leetcode.com/problems/powx-n/description/
package algorithms.medium.p;

public class PowXWithN {
    public static void main(String[] args) {
        PowXWithN pow = new PowXWithN();
        System.out.println("Output:\t" + pow.myPowOptimized(2, 10));
        System.out.println("Output:\t" + pow.myPowOptimized(2.1, 3));
        System.out.println("Output:\t" + pow.myPowOptimized(2, -2));
        System.out.println("Output:\t" + pow.myPow(2, 10));
        System.out.println("Output:\t" + pow.myPow(2.1, 3));
        System.out.println("Output:\t" + pow.myPow(2, -2));
    }

    public double myPowOptimized(double x, int n) {
        if (n > 0) return power(x, n);
        else return 1 / power(x, -(long) n);
    }

    public double power(double num, long exp) {
        double answer = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) answer *= num;
            num *= num;
            exp >>= 1;
        }
        return answer;
    }

    public double myPow(double x, int n) {
        boolean isNegative = n < 0 ? true : false;
        double answer = 1;
        for (long i = 1; i <= Math.abs(n); i++)
            answer *= x;
        return !isNegative ? answer : (1 / answer);
    }
}
