//https://leetcode.com/problems/find-the-middle-index-in-array/description/
package algorithms.easy;

public class FindTheMiddleIndexInArray {
    public static void main(String[] args) {
        FindTheMiddleIndexInArray middle = new FindTheMiddleIndexInArray();
        System.out.println("Output:\t" + middle.findMiddleIndex(new int[]{-1, -1, -1, -1, -1, 0}));
        System.out.println("Output:\t" + middle.findMiddleIndex(new int[]{2, 3, -1, 8, 4}));
        System.out.println("Output:\t" + middle.findMiddleIndex(new int[]{1, -1, 4}));
        System.out.println("Output:\t" + middle.findMiddleIndex(new int[]{2, 5}));
    }

    public int findMiddleIndex(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;

        for (int num : nums)
            totalSum += num;

        for (int i = 0; i < nums.length; i++) {
            if (totalSum - leftSum - nums[i] == leftSum)
                return i;
            else
                leftSum += nums[i];
        }
        return -1;
    }
}
