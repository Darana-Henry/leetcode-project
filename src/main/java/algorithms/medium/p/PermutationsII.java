//https://leetcode.com/problems/permutations-ii/
package algorithms.medium.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    List<List<Integer>> permutations = new ArrayList<>();
    int[] elements;
    boolean[] visited;

    public static void main(String[] args) {
        PermutationsII perm = new PermutationsII();
        System.out.println("Output:\t" + perm.permuteUnique(new int[]{1, 1, 2}));
        System.out.println("Output:\t" + perm.permuteUnique(new int[]{1, 2, 3}));
        System.out.println("Output:\t" + perm.permuteUniqueOptimized(new int[]{1, 1, 2}));
        System.out.println("Output:\t" + perm.permuteUniqueOptimized(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        this.elements = nums;
        visited = new boolean[nums.length];
        backtrack(0, new ArrayList<>());
        return permutations;
    }

    public void backtrack(int start, List<Integer> curr) {
        if (start == elements.length) {
            if (!permutations.contains(new ArrayList<>(curr))) permutations.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                curr.add(elements[i]);
                backtrack(start + 1, curr);
                curr.remove(curr.size() - 1);
                visited[i] = false;
            }
        }
    }

    public List<List<Integer>> permuteUniqueOptimized(int[] nums) {
        Arrays.sort(nums);
        this.elements = nums;
        visited = new boolean[nums.length];
        backtrackOptimized(0, new ArrayList<>());
        return permutations;
    }

    public void backtrackOptimized(int start, List<Integer> curr) {
        if (start == elements.length) {
            permutations.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            if (visited[i] || (i > 0 && elements[i] == elements[i - 1] && !visited[i - 1])) continue;
            visited[i] = true;
            curr.add(elements[i]);
            backtrack(start + 1, curr);
            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
    }
}
