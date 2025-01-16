//https://leetcode.com/problems/find-mirror-score-of-a-string/
package algorithms.medium.f;

import java.util.HashMap;
import java.util.Stack;
import java.util.Map;

public class FindMirrorScoreOfAString {
    public static void main(String[] args) {
        FindMirrorScoreOfAString obj = new FindMirrorScoreOfAString();
        System.out.println("Output:\t" + obj.calculateScore("aczzx"));
        System.out.println("Output:\t" + obj.calculateScore("abcdef"));
    }

    public long calculateScore(String s) {
        long answer = 0;
        Map<Character, Stack<Integer>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int dis = ch - 'a';
            char mirror = (char) ('z' - dis);
            if (map.containsKey(mirror) && !map.get(mirror).isEmpty()) answer += (i - map.get(mirror).pop());
            else map.computeIfAbsent(ch, key -> new Stack<>()).push(i);
        }

        return answer;
    }
}
