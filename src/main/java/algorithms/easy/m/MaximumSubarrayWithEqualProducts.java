//https://leetcode.com/problems/maximum-subarray-with-equal-products/
package algorithms.easy.m;

public class MaximumSubarrayWithEqualProducts {
    public static void main(String[] args) {
        MaximumSubarrayWithEqualProducts obj = new MaximumSubarrayWithEqualProducts();
        System.out.println("Output:\t" + obj.maxLength(new int[]{1, 2, 1, 2, 1, 1, 1}));
        System.out.println("Output:\t" + obj.maxLength(new int[]{2, 3, 4, 5, 6}));
        System.out.println("Output:\t" + obj.maxLength(new int[]{1, 2, 3, 1, 4, 5, 1}));
    }

    public int maxLength(int[] nums) {
        int n = nums.length, answer = 0;

        for (int i = 0; i < n; i++) {
            int currGCD = nums[i];
            int currLCM = nums[i];
            int currPro = nums[i];

            for (int j = i + 1; j < n; j++) {
                currPro *= nums[j];
                currGCD = gcd(currGCD, nums[j]);
                currLCM = lcm(currLCM, nums[j]);

                if (currPro == currLCM * currGCD) answer = Math.max(answer, j - i + 1);
            }
        }

        return answer;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
