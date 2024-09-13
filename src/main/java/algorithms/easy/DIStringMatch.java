//https://leetcode.com/problems/di-string-match/
package algorithms.easy;

public class DIStringMatch {
    public static void main(String[] args) {
        DIStringMatch stringMatch = new DIStringMatch();
        System.out.println("Output:\t" + stringMatch.diStringMatch("IDID"));
        System.out.println("Output:\t" + stringMatch.diStringMatch("III"));
        System.out.println("Output:\t" + stringMatch.diStringMatch("DDI"));
    }

    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        int low = 0;
        int high = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') perm[i] = low++;
            else perm[i] = high--;
        }
        perm[n] = high;
        return perm;
    }
}
