//https://leetcode.com/problems/construct-string-with-repeat-limit/
package algorithms.medium.c;

public class ConstructStringWithRepeatLimit {
    public static void main(String[] args) {
        ConstructStringWithRepeatLimit obj = new ConstructStringWithRepeatLimit();
        System.out.println("Output:\t" + obj.repeatLimitedString("cczazcc", 3));
        System.out.println("Output:\t" + obj.repeatLimitedString("aababab", 2));
    }

    public String repeatLimitedString(String s, int repeatLimit) {
        int[] lc = new int[26];
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray())
            lc[ch - 'a']++;

        for (int i = 25; i >= 0; i--) {
            int next = i - 1;

            while (true) {
                for (int j = Math.min(repeatLimit, lc[i]); j > 0; j--) {
                    lc[i]--;
                    sb.append((char) (i + 'a'));
                }

                if (lc[i] == 0) break;

                while (next >= 0 && lc[next] == 0) {
                    next--;
                }

                if (next < 0) break;

                lc[next]--;
                sb.append((char) (next + 'a'));
            }
        }

        return sb.toString();
    }
}
