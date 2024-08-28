//https://leetcode.com/problems/factorial-trailing-zeroes/
package algorithms.medium;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        FactorialTrailingZeroes zeroes = new FactorialTrailingZeroes();
        System.out.println("Output:\t" + zeroes.trailingZeroes(3));
        System.out.println("Output:\t" + zeroes.trailingZeroes(5));
        System.out.println("Output:\t" + zeroes.trailingZeroes(0));
    }

    public int trailingZeroes(int n) {
        int trailingZeroes = 0;
        while (n > 0) {
            n /= 5;
            trailingZeroes += n;
        }
        return trailingZeroes;
    }
}
