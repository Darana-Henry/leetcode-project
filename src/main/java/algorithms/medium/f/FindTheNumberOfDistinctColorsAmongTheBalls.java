//https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls/
package algorithms.medium.f;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOfDistinctColorsAmongTheBalls {
    public static void main(String[] args) {
        FindTheNumberOfDistinctColorsAmongTheBalls obj = new FindTheNumberOfDistinctColorsAmongTheBalls();
        System.out.println("Output:\t" + obj.queryResults(4, new int[][]{{1, 4}, {2, 5}, {1, 3}, {3, 4}}));
        System.out.println("Output:\t" + obj.queryResults(4, new int[][]{{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}}));
    }

    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> c2b = new HashMap<>();
        Map<Integer, Integer> b2c = new HashMap<>();
        int n = queries.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int b = queries[i][0];
            int c = queries[i][1];
            c2b.merge(c, 1, Integer::sum);

            if (b2c.containsKey(b)) {
                int oc = b2c.get(b);
                if (b2c.merge(oc, -1, Integer::sum) == 0) c2b.remove(oc);
            }

            b2c.put(b, c);
            answer[i] = c2b.size();
        }
        return answer;
    }
}

