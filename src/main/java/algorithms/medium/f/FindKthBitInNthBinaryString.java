//https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
package algorithms.medium.f;

public class FindKthBitInNthBinaryString {
    public static void main(String[] args) {
        FindKthBitInNthBinaryString obj = new FindKthBitInNthBinaryString();
        System.out.println("Output:\t" + obj.findKthBit(3, 1));
        System.out.println("Output:\t" + obj.findKthBit(4, 11));
    }

    public char findKthBit(int n, int k) {
        if (k == 1 || n == 1) return '0';
        int len = (1 << n) - 1, invert = 0;

        while (k > 1) {
            if (k == len / 2 + 1) return invert % 2 == 0 ? '1' : '0';
            else if (k > len / 2 + 1) {
                k = len - k + 1;
                invert++;
            }
            len = len / 2;
        }

        return invert % 2 == 0 ? '0' : '1';
    }
}
