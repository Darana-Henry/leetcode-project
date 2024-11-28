//https://leetcode.com/problems/largest-3-same-digit-number-in-string/
package algorithms.easy.l;

public class Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        Largest3SameDigitNumberInString same3 = new Largest3SameDigitNumberInString();
        System.out.println("Output:\t" + same3.largestGoodInteger("6777133339"));
        System.out.println("Output:\t" + same3.largestGoodInteger("2300019"));
        System.out.println("Output:\t" + same3.largestGoodInteger("42352338"));
    }

    public String largestGoodInteger(String num) {
        for (int i = 9; i >= 0; i--) {
            String triplet = String.valueOf(i).repeat(3);
            if (num.contains(triplet)) return triplet;
        }

        return "";
    }
}
