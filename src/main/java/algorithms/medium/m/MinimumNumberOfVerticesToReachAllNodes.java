//https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
package algorithms.medium.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodes {
    public static void main(String[] args) {
        MinimumNumberOfVerticesToReachAllNodes obj = new MinimumNumberOfVerticesToReachAllNodes();
        System.out.println("Output:\t" + obj.findSmallestSetOfVertices(6,
                Arrays.asList(Arrays.asList(0, 1), Arrays.asList(0, 2), Arrays.asList(2, 5), Arrays.asList(3, 4),
                        Arrays.asList(4, 2))));
        System.out.println("Output:\t" + obj.findSmallestSetOfVertices(5,
                Arrays.asList(Arrays.asList(0, 1), Arrays.asList(2, 1), Arrays.asList(3, 1), Arrays.asList(1, 4),
                        Arrays.asList(2, 4))));
    }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] count = new int[n];
        List<Integer> answer = new ArrayList<>();

        for (List<Integer> edge : edges)
            count[edge.get(1)]++;

        for (int i = 0; i < n; i++)
            if (count[i] == 0) answer.add(i);

        return answer;
    }
}

