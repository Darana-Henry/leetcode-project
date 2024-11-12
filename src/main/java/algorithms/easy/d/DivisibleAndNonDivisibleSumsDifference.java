//https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
package algorithms.easy.d;

public class DivisibleAndNonDivisibleSumsDifference {
    public static void main(String[] args) {
        DivisibleAndNonDivisibleSumsDifference divisible = new DivisibleAndNonDivisibleSumsDifference();
        System.out.println("Output:\t" + divisible.differenceOfSums(10, 3));
        System.out.println("Output:\t" + divisible.differenceOfSums(5, 6));
        System.out.println("Output:\t" + divisible.differenceOfSums(5, 1));
    }

    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) num2 += i;
            else num1 += i;
        }

        return num1 - num2;
    }
}
