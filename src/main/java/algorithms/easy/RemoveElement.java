package algorithms.easy;//https://leetcode.com/problems/remove-element/submissions/1237917064/

public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] intArray = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println("Output:\t" + removeElement.removeElement(intArray, 2));
    }

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[size] = nums[i];
                size++;
            }
        }
        return size;
    }
}
