//https://leetcode.com/problems/integer-to-roman/description/
package algorithms.medium;

public class IntegerToRoman {
    public static void main(String[] args) {
        IntegerToRoman i2r = new IntegerToRoman();
        System.out.println("Output:\t" + i2r.intToRoman(3749));
        System.out.println("Output:\t" + i2r.intToRoman(58));
        System.out.println("Output:\t" + i2r.intToRoman(1994));
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] integers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I",};

        for (int i = 0; i < integers.length; i++) {
            while (num >= integers[i]) {
                sb.append(roman[i]);
                num -= integers[i];
            }
        }
        return sb.toString();
    }
}
