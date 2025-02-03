//https://leetcode.com/problems/find-valid-pair-of-adjacent-digits-in-string/
package algorithms.easy.f;

public class FindValidPairOfAdjacentDigitsInString {
    public static void main(String[] args) {
        FindValidPairOfAdjacentDigitsInString obj = new FindValidPairOfAdjacentDigitsInString();
        System.out.println("Output:\t" + obj.findValidPair("2523533"));
        System.out.println("Output:\t" + obj.findValidPair("221"));
        System.out.println("Output:\t" + obj.findValidPair("22"));
    }

    public String findValidPair(String s) {
        int[] count = new int[10];
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray())
            count[ch - '0']++;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1) && count[s.charAt(i) - '0'] == (s.charAt(i) - '0') && count[s.charAt(
                    i - 1) - '0'] == (s.charAt(i - 1) - '0')) {
                sb.append(s.charAt(i - 1)).append(s.charAt(i));
                return sb.toString();
            }
        }
        return "";
    }
}
