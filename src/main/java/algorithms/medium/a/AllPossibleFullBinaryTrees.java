//https://leetcode.com/problems/all-possible-full-binary-trees/description/
package algorithms.medium.a;

import context.TreeNode;

import java.util.*;

public class AllPossibleFullBinaryTrees {
    Map<Integer, List<TreeNode>> map = new HashMap<>();

    public static void main(String[] args) {
        AllPossibleFullBinaryTrees obj = new AllPossibleFullBinaryTrees();
        System.out.println("Output:\t" + obj.allPossibleFBT(7));
        System.out.println("Output:\t" + obj.allPossibleFBT(3));
    }

    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> answer = new ArrayList<>();
        if (n % 2 == 0) return answer;
        if (n == 1) return List.of(new TreeNode());
        if (map.containsKey(n)) return map.get(n);

        for (int i = 1; i < n; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - i - 1);

            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(0, l, r);
                    answer.add(root);
                }
            }
        }

        return answer;
    }
}
