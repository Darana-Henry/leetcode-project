//https://leetcode.com/problems/find-pivot-index/description/
package algorithms.easy.f;

public class FindPivotIndex {
    public static void main(String[] args) {
        FindPivotIndex pivot = new FindPivotIndex();
        System.out.println("Output:\t" + pivot.pivotIndex(new int[]{-1, -1, -1, -1, -1, 0}));
        System.out.println("Output:\t" + pivot.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println("Output:\t" + pivot.pivotIndex(new int[]{1, 2, 3}));
        System.out.println("Output:\t" + pivot.pivotIndex(new int[]{2, 1, -1}));
    }

    public int pivotIndex(int[] nums) {
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
