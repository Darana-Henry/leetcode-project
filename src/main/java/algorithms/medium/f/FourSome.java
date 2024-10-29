//https://leetcode.com/problems/4sum/description/
package algorithms.medium.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSome {
    public static void main(String[] args) {
        FourSome four = new FourSome();
        System.out.println("Output:\t" + four.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println("Output:\t" + four.fourSum(new int[]{2, 2, 2, 2, 2}, 8));
    }


    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return answer;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > (i + 1) && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        answer.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
                        right--;
                        left++;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum > target) right--;
                    else if (sum < target) left++;
                }
            }
        }
        return answer;
    }
}
