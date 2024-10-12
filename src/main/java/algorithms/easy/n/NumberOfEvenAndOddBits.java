//https://leetcode.com/problems/number-of-even-and-odd-bits/
package algorithms.easy.n;

public class NumberOfEvenAndOddBits {
    public static void main(String[] args) {
        NumberOfEvenAndOddBits number = new NumberOfEvenAndOddBits();
        System.out.println("Output:\t" + number.evenOddBit(50));
        System.out.println("Output:\t" + number.evenOddBit(2));
    }
    public int[] evenOddBit(int n) {
        int[] answer = new int[2];
        for (int i = 0; n > 0; n >>= 1, i ^= 1)
            answer[i] += n & 1;
        return answer;
    }
}
