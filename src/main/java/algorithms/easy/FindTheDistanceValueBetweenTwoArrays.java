//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
package algorithms.easy;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        FindTheDistanceValueBetweenTwoArrays distance = new FindTheDistanceValueBetweenTwoArrays();
        System.out.println("Output:\t" + distance.findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
        System.out.println(
                "Output:\t" + distance.findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30},
                        3));
        System.out.println(
                "Output:\t" + distance.findTheDistanceValue(new int[]{2, 1, 100, 3}, new int[]{-5, -2, 10, -3, 7}, 6));
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int num : arr1)
            if (helper(arr2, num, d)) count++;

        return count;
    }

    public boolean helper(int[] arr, int num, int d) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= num - d) right = mid;
            else left = mid + 1;
        }

        return left >= arr.length || arr[left] > num + d;
    }
}
