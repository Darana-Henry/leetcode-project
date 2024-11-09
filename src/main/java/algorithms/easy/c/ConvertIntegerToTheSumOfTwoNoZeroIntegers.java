//https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
package algorithms.easy.c;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static void main(String[] args) {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers noZero = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        System.out.println("Output:\t" + noZero.getNoZeroIntegers(2));
        System.out.println("Output:\t" + noZero.getNoZeroIntegers(11));
    }

    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; ; a++) {
            int b = n - a;
            if (!containsZero(a) && !containsZero(b)) return new int[]{a, b};
        }
    }

    public boolean containsZero(int num) {
        return (num + "").contains("0");
    }
}
