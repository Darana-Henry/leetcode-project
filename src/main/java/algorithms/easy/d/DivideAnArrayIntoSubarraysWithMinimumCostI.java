//https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/
package algorithms.easy.d;

public class DivideAnArrayIntoSubarraysWithMinimumCostI {
    public static void main(String[] args) {
        DivideAnArrayIntoSubarraysWithMinimumCostI divide = new DivideAnArrayIntoSubarraysWithMinimumCostI();
        System.out.println("Output:\t" + divide.minimumCost(new int[]{1, 2, 3, 12}));
        System.out.println("Output:\t" + divide.minimumCost(new int[]{5, 4, 3}));
        System.out.println("Output:\t" + divide.minimumCost(new int[]{10, 3, 1, 1}));
    }

    public int minimumCost(int[] nums) {
        int first = nums[0];
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < second) {
                third = second;
                second = nums[i];
            } else if (nums[i] < third) third = nums[i];
        }

        return first + second + third;
    }
}
