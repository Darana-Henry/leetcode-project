//https://leetcode.com/problems/reverse-bits/description/
package algorithms.easy.r;

public class ReverseBits {

    public static void main(String[] args) {

        ReverseBits reverseBits = new ReverseBits();
        //System.out.println("Output:\t" + reverseBits.reverseBits(00000010100101000001111010011100));

    }

    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if ((n & 1) > 0)
                result++;
            n >>= 1;
        }
        return result;
    }

    public int reverseBitsSimple(int n) {
        int answer = 0;
        for (int i = 0; i < 32; i++) {
            answer <<= 1;
            answer = answer | (n & 1);
            n >>= 1;
        }
        return answer;
    }
}
