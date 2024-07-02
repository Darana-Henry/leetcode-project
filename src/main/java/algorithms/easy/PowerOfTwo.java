//https://leetcode.com/problems/power-of-two/description/
package algorithms.easy;

public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo two = new PowerOfTwo();
        System.out.println("Output:\t" + two.isPowerOfTwo(1));
        System.out.println("Output:\t" + two.isPowerOfTwo(16));
        System.out.println("Output:\t" + two.isPowerOfTwo(3));
    }

    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}
