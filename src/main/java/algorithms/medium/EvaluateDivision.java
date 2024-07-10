//https://leetcode.com/problems/evaluate-division/description/
package algorithms.medium;

import java.util.*;

public class EvaluateDivision {
    public static void main(String[] args) {
        EvaluateDivision evaluateDivision = new EvaluateDivision();
        //System.out.println("Output:\t" + evaluateDivision.calcEquation(, new double[]{2.0, 3.0}, ));
        //System.out.println("Output:\t" + evaluateDivision.calcEquation(, new double[]{1.5, 2.5, 5.0}, ));
        //System.out.println("Output:\t" + evaluateDivision.calcEquation(, new double[]{0.5}, ));
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Neighbor>> adj = new HashMap();

        for (int i = 0; i < values.length; i++) {
            List<String> edge = equations.get(i);
            List<Neighbor> neighbors = adj.getOrDefault(edge.get(0), new ArrayList<>());
            neighbors.add(new Neighbor(edge.get(1), values[i]));
            adj.put(edge.get(0), neighbors);
            neighbors = adj.getOrDefault(edge.get(1), new ArrayList<>());
            neighbors.add(new Neighbor(edge.get(0), 1 / values[i]));
            adj.put(edge.get(1), neighbors);
        }

        double[] ans = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> q = queries.get(i);
            if (adj.containsKey(q.get(0)) && adj.containsKey(q.get(1)))
                ans[i] = solve(q.get(0), 1.0, new HashSet<>(), q.get(1), adj);
            else
                ans[i] = -1.0;
        }
        return ans;
    }

    private double solve(String node, double ans, Set<String> vis, String target, Map<String, List<Neighbor>> adj) {

        if (vis.contains(node))
            return -1.0;
        if (node.equals(target))
            return ans;

        vis.add(node);
        for (Neighbor nbr : adj.getOrDefault(node, new ArrayList<>())) {
            double val = solve(nbr.v, ans * nbr.w, vis, target, adj);
            if (val != -1)
                return val;
        }
        return -1.0;
    }
}


class Neighbor {
    String v;
    double w;

    Neighbor(String v, double w) {
        this.v = v;
        this.w = w;
    }
}
