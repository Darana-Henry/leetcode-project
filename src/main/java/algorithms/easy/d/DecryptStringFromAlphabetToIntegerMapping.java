//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
package algorithms.easy.d;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        DecryptStringFromAlphabetToIntegerMapping decrypt = new DecryptStringFromAlphabetToIntegerMapping();
        System.out.println("Output:\t" + decrypt.freqAlphabets("10#11#12"));
        System.out.println("Output:\t" + decrypt.freqAlphabets("1326#"));
    }

    public String freqAlphabets(String s) {
        int index = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        while (index < n) {
            if (index + 2 < n && s.charAt(index + 2) == '#') {
                sb.append((char) ('a' + Integer.valueOf(s.substring(index, index + 2)) - 1));
                index += 3;
            } else {
                sb.append((char) ('a' + Integer.valueOf(s.substring(index, index + 1)) - 1));
                index += 1;
            }
        }

        return sb.toString();
    }
}
