//https://leetcode.com/problems/3sum-closest/description/
package algorithms.medium.t;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        ThreeSumClosest sum3 = new ThreeSumClosest();
        System.out.println("Output:\t" + sum3.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        System.out.println("Output:\t" + sum3.threeSumClosest(new int[]{0, 0, 0}, 1));
    }

    public int threeSumClosest(int[] nums, int target) {
        int answer = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int leftPt = i + 1;
            int rightPt = nums.length - 1;

            while (leftPt < rightPt) {
                int runningSum = nums[i] + nums[leftPt] + nums[rightPt];

                if (runningSum == target)
                    return target;

                answer = Math.abs(runningSum - target) < Math.abs(answer - target) ? runningSum : answer;

                if (runningSum > target)
                    rightPt--;
                else
                    leftPt++;

            }
        }
        return answer;
    }
}
