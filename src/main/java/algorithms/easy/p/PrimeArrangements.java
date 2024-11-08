//https://leetcode.com/problems/prime-arrangements/
package algorithms.easy.p;

import java.util.Arrays;

public class PrimeArrangements {
    private static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        PrimeArrangements prime = new PrimeArrangements();
        System.out.println("Output:\t" + prime.numPrimeArrangements(5));
        System.out.println("Output:\t" + prime.numPrimeArrangements(100));
    }

    public int numPrimeArrangements(int n) {
        int primes = countPrimes(n);
        long answer = factorial(primes) * factorial(n - primes);
        return (int) (answer % MOD);
    }

    public long factorial(int n) {
        long answer = 1;
        for (int i = 2; i <= n; i++)
            answer = (answer * i) % MOD;
        return answer;
    }

    public int countPrimes(int n) {
        int answer = 0;
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                answer++;
                for (int j = i + i; j <= n; j += i)
                    primes[j] = false;
            }
        }
        return answer;
    }
}
