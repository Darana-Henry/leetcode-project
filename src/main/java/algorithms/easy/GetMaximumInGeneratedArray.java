//https://leetcode.com/problems/get-maximum-in-generated-array/
package algorithms.easy;


public class GetMaximumInGeneratedArray {
    public static void main(String[] args) {
        GetMaximumInGeneratedArray maxNum = new GetMaximumInGeneratedArray();
        System.out.println("Output:\t" + maxNum.getMaximumGenerated(7));
        System.out.println("Output:\t" + maxNum.getMaximumGenerated(2));
        System.out.println("Output:\t" + maxNum.getMaximumGenerated(3));
    }

    public int getMaximumGenerated(int n) {
        if (n < 2) return n;

        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int answer = Integer.MIN_VALUE;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) nums[i] = nums[i / 2];
            else nums[i] = nums[i / 2] + nums[i / 2 + 1];
            answer = Math.max(answer, nums[i]);
        }
        return answer;
    }
}
