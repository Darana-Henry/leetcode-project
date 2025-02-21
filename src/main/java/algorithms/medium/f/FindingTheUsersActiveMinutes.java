//https://leetcode.com/problems/finding-the-users-active-minutes/
package algorithms.medium.f;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class FindingTheUsersActiveMinutes {
    public static void main(String[] args) {
        FindingTheUsersActiveMinutes obj = new FindingTheUsersActiveMinutes();
        System.out.println(
                "Output:\t" + obj.findingUsersActiveMinutes(new int[][]{{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}}, 5));
        System.out.println("Output:\t" + obj.findingUsersActiveMinutes(new int[][]{{1, 1}, {2, 2}, {2, 3}}, 4));
    }

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] answer = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] log : logs)
            map.computeIfAbsent(log[0], key -> new HashSet<>()).add(log[1]);

        for (Set<Integer> set : map.values())
            answer[set.size() - 1]++;

        return answer;
    }
}
