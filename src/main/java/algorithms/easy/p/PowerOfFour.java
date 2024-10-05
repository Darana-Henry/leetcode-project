//https://leetcode.com/problems/power-of-four/description/
package algorithms.easy.p;

public class PowerOfFour {
    public static void main(String[] args) {
        PowerOfFour four = new PowerOfFour();
        System.out.println("Output:\t" + four.isPowerOfFour(16));
        System.out.println("Output:\t" + four.isPowerOfFour(5));
        System.out.println("Output:\t" + four.isPowerOfFour(1));
    }

    public boolean isPowerOfFour(int n) {
        return ((n > 0) && ((n & (n - 1)) == 0) && (n % 3 == 1));
    }
}
