//https://leetcode.com/problems/binary-number-with-alternating-bits/
package algorithms.easy;

public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        BinaryNumberWithAlternatingBits binary = new BinaryNumberWithAlternatingBits();
        System.out.println("Output:\t" + binary.hasAlternatingBits(5));
        System.out.println("Output:\t" + binary.hasAlternatingBits(7));
        System.out.println("Output:\t" + binary.hasAlternatingBits(11));
    }

    public boolean hasAlternatingBits(int n) {
        n ^= (n >> 1);
        return (n & (n + 1)) == 0;
    }
}
