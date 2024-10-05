package algorithms.easy.r;//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        int[] intArray = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Output:\t" + removeDuplicatesFromSortedArray.removeDuplicates(intArray));
    }

    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }

    public int removeDuplicatesOne(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1])
                continue;
            else
                nums[count++] = nums[i];
        }
        return count;
    }
}
