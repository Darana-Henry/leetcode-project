//https://leetcode.com/problems/buddy-strings/
package algorithms.easy.b;

public class BuddyStrings {
    public static void main(String[] args) {
        BuddyStrings buddy = new BuddyStrings();
        System.out.println("Output:\t" + buddy.buddyStrings("ab", "ba"));
        System.out.println("Output:\t" + buddy.buddyStrings("ab", "ab"));
        System.out.println("Output:\t" + buddy.buddyStrings("aa", "aa"));
    }

    public boolean buddyStrings(String s, String goal) {
        boolean duplicate = false;
        int sLen = s.length(), tLen = goal.length(), diff = 0;
        int[] sCount = new int[26];
        int[] tCount = new int[26];

        if (sLen != tLen) return false;

        for (int i = 0; i < sLen; i++) {
            char sCh = s.charAt(i);
            char tCh = goal.charAt(i);
            sCount[sCh - 'a']++;
            tCount[tCh - 'a']++;
            if (sCh != tCh) diff++;
        }

        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) return false;
            if (sCount[i] > 1) duplicate = true;
        }

        return diff == 2 || (diff == 0 && duplicate);
    }
}
