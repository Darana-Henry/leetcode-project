//https://leetcode.com/problems/number-of-ways-to-split-array/
package algorithms.medium.f;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        FindAllDuplicatesInAnArray obj = new FindAllDuplicatesInAnArray();
        System.out.println("Output:\t" + obj.waysToSplitArray(new int[]{10, 4, -8, 7}));
        System.out.println("Output:\t" + obj.waysToSplitArray(new int[]{2, 3, 1, 0}));
    }

    public int waysToSplitArray(int[] nums) {
        long sum = 0, curr = 0;
        int answer = 0;

        for (int num : nums)
            sum += num;

        for (int i = 0; i < nums.length - 1; i++) {
            curr += nums[i];

            if (curr >= sum - curr) answer++;
        }

        return answer;

    }
}
