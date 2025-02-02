//https://leetcode.com/problems/partition-array-according-to-given-pivot/
package algorithms.medium.p;

import java.util.ArrayList;
import java.util.List;

public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        PartitionArrayAccordingToGivenPivot obj = new PartitionArrayAccordingToGivenPivot();
        System.out.println("Output:\t" + obj.pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10));
        System.out.println("Output:\t" + obj.pivotArray(new int[]{-3, 4, 3, 2}, 2));
        System.out.println("Output:\t" + obj.pivotArrayOptimized(new int[]{9, 12, 5, 10, 14, 3, 10}, 10));
        System.out.println("Output:\t" + obj.pivotArrayOptimized(new int[]{-3, 4, 3, 2}, 2));
    }

    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) left.add(num);
            else if (num > pivot) right.add(num);
            else if (num == pivot) mid.add(num);
        }

        int index = 0;
        for (int i = 0; i < left.size(); i++)
            nums[index++] = left.get(i);

        for (int i = 0; i < mid.size(); i++)
            nums[index++] = mid.get(i);

        for (int i = 0; i < right.size(); i++)
            nums[index++] = right.get(i);

        return nums;
    }

    public int[] pivotArrayOptimized(int[] nums, int pivot) {
        int index = 0;
        int[] answer = new int[nums.length];

        for (int num : nums)
            if (num < pivot) answer[index++] = num;

        for (int num : nums)
            if (num == pivot) answer[index++] = num;

        for (int num : nums)
            if (num > pivot) answer[index++] = num;

        return answer;
    }

}
