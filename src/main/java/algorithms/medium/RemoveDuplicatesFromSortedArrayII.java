//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
package algorithms.medium;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII removeDup = new RemoveDuplicatesFromSortedArrayII();
        System.out.println("Output:\t" + removeDup.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        System.out.println("Output:\t" + removeDup.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    public int removeDuplicates(int[] nums) {
        int returnPointer = 2;
        for (int i = 2; i < nums.length; i++) {
            if (!(nums[i] == nums[returnPointer - 2])) {
                nums[returnPointer] = nums[i];
                returnPointer++;
            }
        }
        return returnPointer;
    }
}
