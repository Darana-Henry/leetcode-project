//https://leetcode.com/problems/power-of-three/description/
package algorithms.easy.p;

public class PowerOfThree {
    public static void main(String[] args) {
        PowerOfThree three = new PowerOfThree();
        System.out.println("Output:\t" + three.isPowerOfThreeBruteForce(27));
        System.out.println("Output:\t" + three.isPowerOfThreeOptimized(0));
        System.out.println("Output:\t" + three.isPowerOfThreeOptimized(-1));
    }

    public boolean isPowerOfThreeOptimized(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }

    public boolean isPowerOfThreeBruteForce(int n) {
        while (n >= 3) {
            if (n % 3 != 0)
                return true;
            n = n / 3;
        }
        return n == 1;
    }
}
