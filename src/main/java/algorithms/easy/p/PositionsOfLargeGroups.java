//https://leetcode.com/problems/positions-of-large-groups/
package algorithms.easy.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsOfLargeGroups {
    public static void main(String[] args) {
        PositionsOfLargeGroups large = new PositionsOfLargeGroups();
        System.out.println("Output:\t" + large.largeGroupPositions("abbxxxxzzy"));
        System.out.println("Output:\t" + large.largeGroupPositions("abc"));
        System.out.println("Output:\t" + large.largeGroupPositions("abcdddeeeeaabbbcd"));
    }

    public List<List<Integer>> largeGroupPositions(String s) {
        int start = 0;
        int n = s.length();
        List<List<Integer>> answer = new ArrayList<>();

        while (start < n) {
            int end = start;
            while (end < n && s.charAt(start) == s.charAt(end)) end++;
            if (end - start >= 3) answer.add(Arrays.asList(start, end - 1));
            start = end;
        }

        return answer;
    }
}
