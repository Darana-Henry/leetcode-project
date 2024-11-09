//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
package algorithms.easy.s;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        SubtractTheProductAndSumOfDigitsOfAnInteger sumprod = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        System.out.println("Output:\t" + sumprod.subtractProductAndSum(234));
        System.out.println("Output:\t" + sumprod.subtractProductAndSum(4421));
    }

    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }
}
