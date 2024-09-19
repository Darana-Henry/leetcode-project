//https://leetcode.com/problems/most-visited-sector-in-a-circular-track/
package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSectorInACircularTrack {
    public static void main(String[] args) {
        MostVisitedSectorInACircularTrack visited = new MostVisitedSectorInACircularTrack();
        System.out.println("Output:\t" + visited.mostVisited(4, new int[]{1, 3, 1, 2}));
        System.out.println("Output:\t" + visited.mostVisited(2, new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2}));
        System.out.println("Output:\t" + visited.mostVisited(7, new int[]{1, 3, 5, 7}));
    }

    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length - 1];
        List<Integer> visited = new ArrayList<>();
        if (start <= end) {
            for (int i = start; i <= end; i++)
                visited.add(i);
        } else {
            for (int i = 1; i <= end; i++)
                visited.add(i);
            for (int i = start; i <= n; i++)
                visited.add(i);
        }
        return visited;
    }
}
