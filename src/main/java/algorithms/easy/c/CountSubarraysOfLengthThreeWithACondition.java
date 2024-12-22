//https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/
package algorithms.easy.c;

public class CountSubarraysOfLengthThreeWithACondition {
    public static void main(String[] args) {
        CountSubarraysOfLengthThreeWithACondition obj = new CountSubarraysOfLengthThreeWithACondition();
        System.out.println("Output:\t" + obj.countSubarrays(new int[]{1, 2, 1, 4, 1}));
        System.out.println("Output:\t" + obj.countSubarrays(new int[]{1, 1, 1}));
    }

    public int countSubarrays(int[] nums) {
        int answer = 0;
        for (int i = 2; i < nums.length; i++)
            if (((nums[i - 2] + nums[i]) * 2) == nums[i - 1]) answer++;
        return answer;
    }
}
