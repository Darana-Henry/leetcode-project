//https://leetcode.com/problems/queries-on-a-permutation-with-key/
package algorithms.medium.q;

import java.util.LinkedList;
import java.util.List;

public class QueriesOnAPermutationWithKey {
    public static void main(String[] args) {
        QueriesOnAPermutationWithKey obj = new QueriesOnAPermutationWithKey();
        System.out.println("Output:\t" + obj.processQueries(new int[]{3, 1, 2, 1}, 5));
        System.out.println("Output:\t" + obj.processQueries(new int[]{4, 1, 2, 2}, 4));
        System.out.println("Output:\t" + obj.processQueries(new int[]{7, 5, 5, 8, 3}, 8));
    }

    public int[] processQueries(int[] queries, int m) {
        int[] answer = new int[queries.length];
        List<Integer> list = new LinkedList<>();

        for (int i = 1; i <= m; i++)
            list.add(i);

        int i = 0;
        for (int q : queries) {
            int index = list.indexOf(q);
            answer[i++] = index;
            list.remove(index);
            list.add(0, q);
        }

        return answer;
    }
}
