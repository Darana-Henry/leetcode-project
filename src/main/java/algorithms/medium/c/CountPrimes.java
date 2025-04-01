//https://leetcode.com/problems/count-primes/
package algorithms.medium.c;

import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        CountPrimes obj = new CountPrimes();
        System.out.println("Output:\t" + obj.countPrimes(10));
        System.out.println("Output:\t" + obj.countPrimes(0));
        System.out.println("Output:\t" + obj.countPrimes(1));
    }

    public int countPrimes(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) answer++;

            for (int j = i * 2; j < n; j += i)
                isPrime[j] = false;
        }

        return answer;
    }
}
