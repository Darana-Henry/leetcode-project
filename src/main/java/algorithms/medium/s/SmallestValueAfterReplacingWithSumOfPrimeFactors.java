//https://leetcode.com/problems/smallest-value-after-replacing-with-sum-of-prime-factors/
package algorithms.medium.s;

public class SmallestValueAfterReplacingWithSumOfPrimeFactors {
    public static void main(String[] args) {
        SmallestValueAfterReplacingWithSumOfPrimeFactors obj = new SmallestValueAfterReplacingWithSumOfPrimeFactors();
        System.out.println("Output:\t" + obj.smallestValue(15));
        System.out.println("Output:\t" + obj.smallestValue(3));
    }

    public int smallestValue(int n) {
        while (true) {
            int org = n, sum = 0;

            for (int i = 2; i <= org / i; i++) {
                while (n % i == 0) {
                    sum += i;
                    n /= i;
                }
            }

            if (n > 1) sum += n;
            if (sum == org) return sum;
            n = sum;
        }
    }
}
