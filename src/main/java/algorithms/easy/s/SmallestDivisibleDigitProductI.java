//https://leetcode.com/problems/smallest-divisible-digit-product-i/
package algorithms.easy.s;

public class SmallestDivisibleDigitProductI {
    public static void main(String[] args) {
        SmallestDivisibleDigitProductI smallest = new SmallestDivisibleDigitProductI();
        System.out.println("Output:\t" + smallest.smallestNumber(10, 2));
        System.out.println("Output:\t" + smallest.smallestNumber(15, 3));
    }

    public int smallestNumber(int n, int t) {
        for (int x = n; x <= n + t; x++) {
            int prod = 1;

            for (int i = x; i > 0; i /= 10)
                prod *= i % 10;

            if (prod % t == 0) return x;
        }
        return 1;
    }
}
