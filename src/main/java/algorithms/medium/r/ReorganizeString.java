//https://leetcode.com/problems/reorganize-string/
package algorithms.medium.r;

public class ReorganizeString {
    public static void main(String[] args) {
        ReorganizeString obj = new ReorganizeString();
        System.out.println("Output:\t" + obj.reorganizeString("aab"));
        System.out.println("Output:\t" + obj.reorganizeString("aaab"));
    }

    public String reorganizeString(String s) {
        int max = 0, index = 0, n = s.length();
        int[] count = new int[26];
        char[] answer = new char[n];

        for (char ch : s.toCharArray())
            count[ch - 'a']++;

        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                index = i;
            }
        }

        if (max > (n + 1) / 2) return "";

        int idx = 0;
        while (count[index]-- > 0) {
            answer[idx] = (char) (index + 'a');
            idx += 2;
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                if (idx >= n) idx = 1;
                answer[idx] = (char) (i + 'a');
                idx += 2;
            }
        }
        return String.valueOf(answer);
    }
}
