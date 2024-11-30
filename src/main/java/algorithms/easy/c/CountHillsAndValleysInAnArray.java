//https://leetcode.com/problems/count-hills-and-valleys-in-an-array/
package algorithms.easy.c;

public class CountHillsAndValleysInAnArray {
    public static void main(String[] args) {
        CountHillsAndValleysInAnArray hills = new CountHillsAndValleysInAnArray();
        System.out.println("Output:\t" + hills.countHillValley(new int[]{2, 4, 1, 1, 6, 5}));
        System.out.println("Output:\t" + hills.countHillValley(new int[]{6, 6, 5, 5, 4, 1}));
    }

    public int countHillValley(int[] nums) {
        int answer = 0;
        for (int i = 1, prev = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) continue;
            if ((nums[i] > nums[prev] && nums[i] > nums[i + 1]) || (nums[i] < nums[prev] && nums[i] < nums[i + 1]))
                answer++;
            prev = i;
        }
        return answer;
    }

}
