//https://leetcode.com/problems/total-cost-to-hire-k-workers/
package algorithms.medium;

public class TotalCostToHireKWorkers {
    public static void main(String[] args) {
        TotalCostToHireKWorkers totalCost = new TotalCostToHireKWorkers();
        System.out.println("Output:\t" + totalCost.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4));
        System.out.println("Output:\t" + totalCost.totalCost(new int[]{1, 2, 4, 1}, 3, 3));
    }

    public long totalCost(int[] costs, int k, int candidates) {
        return 1;
    }
}
