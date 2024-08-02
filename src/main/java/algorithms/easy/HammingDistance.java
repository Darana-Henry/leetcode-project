//https://leetcode.com/problems/hamming-distance/
package algorithms.easy;

public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance hamming = new HammingDistance();
        System.out.println("Output:\t" + hamming.hammingDistance(1, 4));
        System.out.println("Output:\t" + hamming.hammingDistance(1, 3));
    }

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int hamming = 0;

        while (xor != 0) {
            hamming += xor & 1;
            xor = xor >> 1;
        }

        return hamming;
    }
}
