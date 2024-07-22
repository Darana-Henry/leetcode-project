package patterns.slidingwindow;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        MaximumAverageSubarray sw = new MaximumAverageSubarray();
        System.out.println("Output:\t" + sw.slidingWindow(new int[]{1, 3, 4, 5, 6, 7, 11, 21}, 4));

    }

    public int slidingWindow(int[] nums, int zone) {
        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (i - current == zone) {
                maxSum = Math.max(maxSum, runningSum);
                runningSum -= nums[i];
                current--;
            }
            current++;
        }
        return maxSum;
    }
}
