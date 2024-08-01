//https://leetcode.com/problems/hamming-distance/
package algorithms.easy;

public class HammingDistance {
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
