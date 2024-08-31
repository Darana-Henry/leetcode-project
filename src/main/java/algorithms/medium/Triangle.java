//https://leetcode.com/problems/triangle/
package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        List<List<Integer>> t1 = new ArrayList<>();
        t1.add(new ArrayList<Integer>() {{
            add(2);

        }});
        t1.add(new ArrayList<Integer>() {{
            add(3);
            add(4);
        }});
        t1.add(new ArrayList<Integer>() {{
            add(6);
            add(5);
            add(7);
        }});
        t1.add(new ArrayList<Integer>() {{
            add(4);
            add(1);
            add(8);
            add(3);
        }});
        System.out.println("Output:\t" + triangle.minimumTotal(t1));
        List<List<Integer>> t2 = new ArrayList<>();
        t1.add(new ArrayList<Integer>() {{
            add(-10);
        }});
        System.out.println("Output:\t" + triangle.minimumTotal(t2));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        int[] dp = new int[height + 1];
        for (int i = height - 1; i >= 0; i--)
            for (int j = 0; j <= i; j++)
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);

        return dp[0];
    }
}
