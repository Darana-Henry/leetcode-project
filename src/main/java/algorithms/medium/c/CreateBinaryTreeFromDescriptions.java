//https://leetcode.com/problems/create-binary-tree-from-descriptions/
package algorithms.medium.c;

import context.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CreateBinaryTreeFromDescriptions {
    public static void main(String[] args) {
        CreateBinaryTreeFromDescriptions obj = new CreateBinaryTreeFromDescriptions();
        System.out.println("Output:\t" + obj.createBinaryTree(
                new int[][]{{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}}));
        System.out.println("Output:\t" + obj.createBinaryTree(new int[][]{{1, 2, 1}, {2, 3, 0}, {3, 4, 1}}));
    }

    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int[] desc : descriptions) {
            int par = desc[0];
            int chi = desc[1];
            boolean isLeft = desc[2] == 1;
            if (!map.containsKey(par)) map.put(par, new TreeNode(par));
            if (!map.containsKey(chi)) map.put(chi, new TreeNode(chi));
            if (isLeft) map.get(par).left = map.get(chi);
            else map.get(par).right = map.get(chi);
            set.add(chi);
        }

        for (TreeNode p : map.values())
            if (!set.contains(p.val)) return p;

        return null;
    }
}
