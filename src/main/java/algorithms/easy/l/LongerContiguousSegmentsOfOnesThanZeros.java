//https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
package algorithms.easy.l;

public class LongerContiguousSegmentsOfOnesThanZeros {
    public static void main(String[] args) {
        LongerContiguousSegmentsOfOnesThanZeros contiguous = new LongerContiguousSegmentsOfOnesThanZeros();
        System.out.println("Output:\t" + contiguous.checkZeroOnes("1101"));
        System.out.println("Output:\t" + contiguous.checkZeroOnes("111000"));
        System.out.println("Output:\t" + contiguous.checkZeroOnes("110100010"));
    }

    public boolean checkZeroOnes(String s) {
        int ones = 0, zeros = 0, currOne = 0, currZero = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                currOne++;
                currZero = 0;
            } else {
                currZero++;
                currOne = 0;
            }

            ones = Math.max(currOne, ones);
            zeros = Math.max(currZero, zeros);
        }

        return ones > zeros;
    }
}
