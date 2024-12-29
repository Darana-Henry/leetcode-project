//https://leetcode.com/problems/subarray-product-less-than-k/description/
package algorithms.medium.s;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        SubarrayProductLessThanK obj = new SubarrayProductLessThanK();
        System.out.println("Output:\t" + obj.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
        System.out.println("Output:\t" + obj.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int answer = 0;

        for (int left = 0, right = 0, product = 1; right < nums.length; right++) {
            product *= nums[right];
            while (left <= right && product >= k) {
                product /= nums[left++];
            }
            answer += right - left + 1;
        }

        return answer;
    }
}
