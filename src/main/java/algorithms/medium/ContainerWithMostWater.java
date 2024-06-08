//https://leetcode.com/problems/container-with-most-water/description/
package algorithms.medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {

        ContainerWithMostWater containers = new ContainerWithMostWater();

        System.out.println("Output:\t" + containers.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println("Output:\t" + containers.maxArea(new int[]{1, 1}));
    }

    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int min = Math.min(height[left], height[right]);
            max = Math.max(max, min * (right - left));

            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
