//https://leetcode.com/problems/sum-of-two-integers/
package algorithms.medium.s;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        SumOfTwoIntegers obj = new SumOfTwoIntegers();
        System.out.println("Output:\t" + obj.getSum(1, 2));
        System.out.println("Output:\t" + obj.getSum(2, 3));
    }

    public int getSum(int a, int b) {
        if (b == 0) return a;
        else return getSum(a ^ b, (a & b) << 1);
    }
}
