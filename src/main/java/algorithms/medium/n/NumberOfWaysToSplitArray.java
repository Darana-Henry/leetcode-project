//https://leetcode.com/problems/find-all-duplicates-in-an-array/
package algorithms.medium.n;

import java.util.*;

public class NumberOfWaysToSplitArray {
    public static void main(String[] args) {
        NumberOfWaysToSplitArray obj = new NumberOfWaysToSplitArray();
        System.out.println("Output:\t" + obj.findDuplicatesWithSet(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println("Output:\t" + obj.findDuplicatesWithSet(new int[]{1, 1, 2}));
        System.out.println("Output:\t" + obj.findDuplicatesWithSet(new int[]{1}));

        System.out.println("Output:\t" + obj.findDuplicatesWithSorting(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println("Output:\t" + obj.findDuplicatesWithSorting(new int[]{1, 1, 2}));
        System.out.println("Output:\t" + obj.findDuplicatesWithSorting(new int[]{1}));

        System.out.println("Output:\t" + obj.findDuplicatesWithoutAuxiliarySpace(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println("Output:\t" + obj.findDuplicatesWithoutAuxiliarySpace(new int[]{1, 1, 2}));
        System.out.println("Output:\t" + obj.findDuplicatesWithoutAuxiliarySpace(new int[]{1}));

        System.out.println("Output:\t" + obj.findDuplicatesWithIndexing(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println("Output:\t" + obj.findDuplicatesWithIndexing(new int[]{1, 1, 2}));
        System.out.println("Output:\t" + obj.findDuplicatesWithIndexing(new int[]{1}));
    }

    public List<Integer> findDuplicatesWithSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> answer = new ArrayList<>();

        for (int num : nums)
            if (!set.add(num)) answer.add(num);

        return answer;
    }

    public List<Integer> findDuplicatesWithSorting(int[] nums) {
        Arrays.sort(nums);
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1]) answer.add(nums[i]);

        return answer;
    }

    public List<Integer> findDuplicatesWithoutAuxiliarySpace(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != i + 1) answer.add(nums[i]);

        return answer;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<Integer> findDuplicatesWithIndexing(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) answer.add(index + 1);
            nums[index] = -nums[index];
        }

        return answer;
    }
}
