//https://leetcode.com/problems/n-th-tribonacci-number/description/
package algorithms.easy;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        NthTribonacciNumber trib = new NthTribonacciNumber();
        System.out.println("Output:\t" + trib.tribonacci(4));
        System.out.println("Output:\t" + trib.tribonacci(25));
    }

    public int tribonacci(int n) {
        int[] trib = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i == 0)
                trib[0] = 0;
            else if (i == 1)
                trib[1] = 1;
            else if (i == 2)
                trib[2] = 1;
            else
                trib[i] = trib[i - 3] + trib[i - 2] + trib[i - 1];
        }
        return trib[n];
    }
}
