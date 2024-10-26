//https://leetcode.com/problems/increasing-decreasing-string/
package algorithms.easy.i;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        IncreasingDecreasingString incDec = new IncreasingDecreasingString();
        System.out.println("Output:\t" + incDec.sortString("aaaabbbbcccc"));
        System.out.println("Output:\t" + incDec.sortString("rat"));
    }

    public String sortString(String s) {
        int[] count = new int[26];
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray())
            count[ch - 'a']++;

        while (sb.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                }
            }
        }

        return sb.toString();
    }
}
