//https://leetcode.com/problems/sum-of-good-numbers/
package algorithms.easy.s;

public class SumOfGoodNumbers {
    public static void main(String[] args) {
        SumOfGoodNumbers obj = new SumOfGoodNumbers();
        System.out.println("Output:\t" + obj.sumOfGoodNumbers(new int[]{1, 3, 2, 1, 5, 4}, 2));
        System.out.println("Output:\t" + obj.sumOfGoodNumbers(new int[]{2, 1}, 1));
    }

    public int sumOfGoodNumbers(int[] nums, int k) {
        int answer = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            int left = i - k, right = i + k;
            if (((left < 0) || (nums[left] < nums[i])) && ((right >= n) || (nums[right] < nums[i]))) answer += nums[i];
        }

        return answer;
    }
}
