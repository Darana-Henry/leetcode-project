//https://leetcode.com/problems/n-ary-tree-postorder-traversal/
package algorithms.medium.n;

import context.NaryNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;


public class NaryTreePostorderTraversal {
    List<Integer> answer = new ArrayList<>();

    public List<Integer> postorderWithDFS(NaryNode root) {
        if (root == null) return answer;
        dfs(root);
        return answer;
    }

    public void dfs(NaryNode node) {
        for (NaryNode child : node.children)
            dfs(child);
        answer.add(node.val);
    }

    public List<Integer> postorderWithIteration(NaryNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) return answer;

        Deque<NaryNode> stack = new ArrayDeque<>();
        stack.offerLast(root);
        while (!stack.isEmpty()) {
            NaryNode current = stack.pollLast();
            answer.add(current.val);
            for (NaryNode child : current.children)
                stack.offerLast(child);
        }
        return answer;
    }
}
