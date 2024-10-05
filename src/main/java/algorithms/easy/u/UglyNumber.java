//https://leetcode.com/problems/ugly-number/description/
package algorithms.easy.u;

public class UglyNumber {
    public static void main(String[] args) {
        UglyNumber ugly = new UglyNumber();
        System.out.println("Output:\t" + ugly.isUgly(6));
        System.out.println("Output:\t" + ugly.isUgly(1));
        System.out.println("Output:\t" + ugly.isUgly(0));
    }

    public boolean isUgly(int n) {
        for (int i = 2; i < 6 && n > 0; i++)
            while (n % i == 0)
                n /= i;
        return n == 1;
    }
}
