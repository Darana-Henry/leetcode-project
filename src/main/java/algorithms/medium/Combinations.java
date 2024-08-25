//https://leetcode.com/problems/combinations/
package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    int n1;
    int k1;
    private List<List<Integer>> answer = new ArrayList<>();

    public static void main(String[] args) {
        Combinations combo = new Combinations();
        System.out.println("Output:\t" + combo.combine(4, 2));
        System.out.println("Output:\t" + combo.combine(1, 1));
    }

    public List<List<Integer>> combine(int n, int k) {
        this.n1 = n;
        this.k1 = k;
        backtrack(1, new ArrayList<>());
        return answer;
    }

    public void backtrack(int index, List<Integer> curr) {
        if (curr.size() == k1) {
            answer.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i <= n1; i++) {
            curr.add(i);
            backtrack(i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
