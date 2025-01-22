//https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/
package algorithms.easy.m;

public class MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public static void main(String[] args) {
        MaximumDifferenceBetweenAdjacentElementsInACircularArray obj = new MaximumDifferenceBetweenAdjacentElementsInACircularArray();
        System.out.println("Output:\t" + obj.maxAdjacentDistance(new int[]{1, 2, 4}));
        System.out.println("Output:\t" + obj.maxAdjacentDistance(new int[]{-5, -10, -5}));
    }

    public int maxAdjacentDistance(int[] nums) {
        int answer = 0, n = nums.length;
        for (int i = 0; i < n; i++)
            answer = Math.max(answer, Math.abs(nums[i] - nums[(i + 1) % n]));
        return answer;
    }
}
