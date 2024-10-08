//https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/
package algorithms.easy.l;


import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceI {
    public static void main(String[] args) {
        LongestUnequalAdjacentGroupsSubsequenceI adjacent = new LongestUnequalAdjacentGroupsSubsequenceI();
        System.out.println(
                "Output:\t" + adjacent.getLongestSubsequence(new String[]{"e", "a", "b"}, new int[]{0, 0, 1}));
        System.out.println(
                "Output:\t" + adjacent.getLongestSubsequence(new String[]{"a", "b", "c", "d"}, new int[]{1, 0, 1, 1}));
    }

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < groups.length; i++)
            if (i == 0 || groups[i] != groups[i - 1]) answer.add(words[i]);

        return answer;
    }
}
