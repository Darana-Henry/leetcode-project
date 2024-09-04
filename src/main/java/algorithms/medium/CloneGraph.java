//https://leetcode.com/problems/clone-graph/
package algorithms.medium;

import context.GraphNode;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    Map<GraphNode, GraphNode> map = new HashMap<>();

    public static void main(String[] args) {
        CloneGraph clone = new CloneGraph();
        //clone.cloneGraph();
    }

    public GraphNode cloneGraph(GraphNode node) {
        if (node == null) return null;
        if (map.containsKey(node)) return map.get(node);
        GraphNode clone = new GraphNode(node.val);
        map.put(node, clone);
        for (GraphNode neighbor : node.neighbors)
            clone.neighbors.add(cloneGraph(neighbor));
        return clone;
    }
}
