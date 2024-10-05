//https://leetcode.com/problems/min-cost-climbing-stairs/description/
package algorithms.easy.m;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        MinCostClimbingStairs minCost = new MinCostClimbingStairs();
        System.out.println("Output:\t" + minCost.minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println("Output:\t" + minCost.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int costOf1Step = 0;
        int costOf2Steps = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            int currentStep = cost[i] + Math.min(costOf1Step, costOf2Steps);
            costOf1Step = costOf2Steps;
            costOf2Steps = currentStep;
        }

        return Math.min(costOf1Step, costOf2Steps);
    }
}
