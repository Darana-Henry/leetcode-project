package algorithms.easy.c;//https://leetcode.com/problems/climbing-stairs/description/

public class ClimbingStairs {

    public static void main(String[] args) {

        ClimbingStairs climbingStairs = new ClimbingStairs();

        System.out.println("Output:\t" + climbingStairs.climbStairs(21));
        System.out.println("Output:\t" + climbingStairs.climbStairs(37));
    }

    public int climbStairs(int n) {
        int[] climb = new int[n + 1];
        climb[0] = 1;
        climb[1] = 1;
        for (int i = 2; i <= n; i++) {
            climb[i] = climb[i - 1] + climb[i - 2];
        }
        return climb[n];
    }
}
