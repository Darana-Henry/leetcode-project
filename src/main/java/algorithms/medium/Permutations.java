//https://leetcode.com/problems/permutations/
package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    private List<List<Integer>> answer = new ArrayList<>();
    private List<Integer> curr = new ArrayList<>();
    private boolean[] visited;
    private int[] cp;

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        System.out.println("Output:\t" + permutations.permute(new int[]{1, 2, 3}));
        System.out.println("Output:\t" + permutations.permute(new int[]{0, 1}));
        System.out.println("Output:\t" + permutations.permute(new int[]{1}));
    }

    public List<List<Integer>> permute(int[] nums) {
        this.cp = nums;
        visited = new boolean[nums.length];
        backtrack(0);
        return answer;
    }

    public void backtrack(int index) {
        if (index == cp.length) {
            answer.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < cp.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                curr.add(cp[i]);
                backtrack(index + 1);
                curr.remove(curr.size() - 1);
                visited[i] = false;
            }
        }
    }
}
