//https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
package algorithms.easy.m;

public class MinimumBitFlipsToConvertNumber {
    public static void main(String[] args) {
        MinimumBitFlipsToConvertNumber flips = new MinimumBitFlipsToConvertNumber();
        System.out.println("Output:\t" + flips.minBitFlips(10, 7));
        System.out.println("Output:\t" + flips.minBitFlips(3, 4));
    }

    public int minBitFlips(int start, int goal) {
        int diff = start ^ goal;
        int flips = 0;
        while (diff > 0) {
            flips += diff & 1;
            diff >>= 1;
        }
        return flips;
    }
}
