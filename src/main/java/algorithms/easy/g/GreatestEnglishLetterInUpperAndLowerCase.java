//https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/
package algorithms.easy.g;

public class GreatestEnglishLetterInUpperAndLowerCase {
    public static void main(String[] args) {
        GreatestEnglishLetterInUpperAndLowerCase greatest = new GreatestEnglishLetterInUpperAndLowerCase();
        System.out.println("Output:\t" + greatest.greatestLetter("lEeTcOdE"));
        System.out.println("Output:\t" + greatest.greatestLetter("arRAzFif"));
        System.out.println("Output:\t" + greatest.greatestLetter("AbCdEfGhIjK"));
    }

    public String greatestLetter(String s) {
        int lower = 0, upper = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) lower |= 1 << (ch - 'a');
            else upper |= 1 << (ch - 'A');
        }

        int common = lower & upper;
        return common > 0 ? String.valueOf((char) (31 - Integer.numberOfLeadingZeros(common) + 'A')) : "";
    }
}
