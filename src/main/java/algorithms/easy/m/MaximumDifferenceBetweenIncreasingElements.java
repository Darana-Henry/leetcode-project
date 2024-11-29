//https://leetcode.com/problems/maximum-difference-between-increasing-elements/
package algorithms.easy.m;

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        MaximumDifferenceBetweenIncreasingElements maxDiff = new MaximumDifferenceBetweenIncreasingElements();
        System.out.println("Output:\t" + maxDiff.maximumDifference(new int[]{7, 1, 5, 4}));
        System.out.println("Output:\t" + maxDiff.maximumDifference(new int[]{9, 4, 3, 2}));
        System.out.println("Output:\t" + maxDiff.maximumDifference(new int[]{1, 5, 2, 10}));
    }

    public int maximumDifference(int[] nums) {
        int currMin = Integer.MAX_VALUE, answer = -1;
        for (int num : nums)
            if (num > currMin) answer = Math.max(answer, num - currMin);
            else currMin = num;
        return answer;
    }
}
