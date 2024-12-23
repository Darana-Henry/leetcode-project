//https://leetcode.com/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level/
package algorithms.medium.m;

import context.TreeNode;

import java.util.*;

public class MinimumNumberOfOperationsToSortABinaryTreeByLevel {
    public static void main(String[] args) {
        MinimumNumberOfOperationsToSortABinaryTreeByLevel obj = new MinimumNumberOfOperationsToSortABinaryTreeByLevel();
        System.out.println("Output:\t" + obj.minimumOperations(
                new TreeNode(1, new TreeNode(4, new TreeNode(7), new TreeNode(6)),
                        new TreeNode(3, new TreeNode(8, new TreeNode(9), new TreeNode()),
                                new TreeNode(5, new TreeNode(10), new TreeNode())))));
    }

    public int minimumOperations(TreeNode root) {
        int answer = 0;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = q.size(); i > 0; i--) {
                TreeNode curr = q.poll();
                list.add(curr.val);

                if (curr.left != null) q.offer(curr.left);

                if (curr.right != null) q.offer(curr.right);
            }

            answer += compute(list);
        }
        return answer;
    }

    public int compute(List<Integer> list) {
        int n = list.size(), answer = 0;
        int[] indices = new int[n];
        List<Integer> sorted = new ArrayList<>(list);
        Map<Integer, Integer> map = new HashMap<>();

        sorted.sort(Integer::compareTo);

        for (int i = 0; i < n; i++)
            map.put(sorted.get(i), i);

        for (int i = 0; i < n; i++)
            indices[i] = map.get(list.get(i));

        for (int i = 0; i < n; i++) {
            while (indices[i] != i) {
                swap(indices, i, indices[i]);
                answer++;
            }
        }

        return answer;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
