//https://leetcode.com/problems/minimum-distance-to-the-target-element/
package algorithms.easy.m;

public class MinimumDistanceToTheTargetElement {
    public static void main(String[] args) {
        MinimumDistanceToTheTargetElement minDist = new MinimumDistanceToTheTargetElement();
        System.out.println("Output:\t" + minDist.getMinDistance(new int[]{1, 2, 3, 4, 5}, 5, 3));
        System.out.println("Output:\t" + minDist.getMinDistance(new int[]{1}, 1, 0));
        System.out.println("Output:\t" + minDist.getMinDistance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1, 0));
    }

    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length, answer = n;
        for (int i = 0; i < n; i++)
            if (nums[i] == target) answer = Math.min(answer, Math.abs(i - start));
        return answer;
    }
}
