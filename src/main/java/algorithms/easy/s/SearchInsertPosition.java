package algorithms.easy.s;

public class SearchInsertPosition {

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] intArray = new int[]{1, 3, 5, 6};
        System.out.println("Output:\t" + searchInsertPosition.searchInsert(intArray, 5));

        intArray = new int[]{1, 3, 5, 6};
        System.out.println("Output:\t" + searchInsertPosition.searchInsert(intArray, 7));
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }
}
