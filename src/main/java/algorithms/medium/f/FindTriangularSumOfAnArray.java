//https://leetcode.com/problems/find-triangular-sum-of-an-array/
package algorithms.medium.f;

public class FindTriangularSumOfAnArray {
    public static void main(String[] args) {
        FindTriangularSumOfAnArray obj = new FindTriangularSumOfAnArray();
        System.out.println("Output:\t" + obj.triangularSum(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + obj.triangularSum(new int[]{5}));
    }

    public int triangularSum(int[] nums) {
        int n = nums.length;

        for (int i = n; i > 0; i--)
            for (int j = 0; j < i - 1; j++)
                nums[j] = (nums[j] + nums[j + 1]) % 10;

        return nums[0];
    }
}
