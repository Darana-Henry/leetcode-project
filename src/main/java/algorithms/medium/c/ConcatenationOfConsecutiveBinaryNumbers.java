//https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/
package algorithms.medium.c;

public class ConcatenationOfConsecutiveBinaryNumbers {
    public static void main(String[] args) {
        ConcatenationOfConsecutiveBinaryNumbers obj = new ConcatenationOfConsecutiveBinaryNumbers();
        System.out.println("Output:\t" + obj.concatenatedBinary(1));
        System.out.println("Output:\t" + obj.concatenatedBinary(3));
        System.out.println("Output:\t" + obj.concatenatedBinary(12));
    }

    public int concatenatedBinary(int n) {
        int MOD = 1000000007;
        long answer = 0;

        for (int i = 1; i <= n; i++) {
            int temp = i;

            while (temp > 0) {
                temp /= 2;
                answer *= 2;
            }

            answer = (answer + i) % MOD;
        }

        return (int) answer;
    }
}

