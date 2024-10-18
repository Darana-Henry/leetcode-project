//https://leetcode.com/problems/largest-perimeter-triangle/
package algorithms.easy.l;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        LargestPerimeterTriangle perimeter = new LargestPerimeterTriangle();
        System.out.println("Output:\t" + perimeter.largestPerimeter(new int[]{2, 1, 2}));
        System.out.println("Output:\t" + perimeter.largestPerimeter(new int[]{1, 2, 1, 10}));
    }

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int smallerSidesSum = nums[i - 2] + nums[i - 1];
            if (smallerSidesSum > nums[i]) return smallerSidesSum + nums[i];
        }
        return 0;
    }
}
