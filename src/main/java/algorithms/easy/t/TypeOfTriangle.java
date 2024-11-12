//https://leetcode.com/problems/type-of-triangle/
package algorithms.easy.t;

import java.util.Arrays;

public class TypeOfTriangle {
    public static void main(String[] args) {
        TypeOfTriangle triangle = new TypeOfTriangle();
        System.out.println("Output:\t" + triangle.triangleType(new int[]{3, 3, 3}));
        System.out.println("Output:\t" + triangle.triangleType(new int[]{3, 4, 5}));
        System.out.println("Output:\t" + triangle.triangleTypeOptimized(new int[]{3, 3, 3}));
        System.out.println("Output:\t" + triangle.triangleTypeOptimized(new int[]{3, 4, 5}));
    }

    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) return "none";
        if (nums[0] == nums[1] && nums[2] == nums[1]) return "equilateral";
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) return "isosceles";
        return "scalene";
    }

    public String triangleTypeOptimized(int[] nums) {
        if (nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[2] + nums[1] <= nums[0]) return "none";
        if (nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) return "isosceles";
        return "scalene";
    }
}
