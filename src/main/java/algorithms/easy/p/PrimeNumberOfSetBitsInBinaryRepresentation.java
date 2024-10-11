//https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
package algorithms.easy.p;

import java.util.Set;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public static void main(String[] args) {
        PrimeNumberOfSetBitsInBinaryRepresentation prime = new PrimeNumberOfSetBitsInBinaryRepresentation();
        System.out.println("Output:\t" + prime.countPrimeSetBits(6, 10));
        System.out.println("Output:\t" + prime.countPrimeSetBits(10, 15));
    }

    public int countPrimeSetBits(int left, int right) {
        int answer = 0;
        Set<Integer> primes = Set.of(2, 3, 5, 7, 11, 13, 17, 19);

        for (int i = left; i <= right; i++)
            if (primes.contains(Integer.bitCount(i))) answer++;

        return answer;
    }
}
