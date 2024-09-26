//https://leetcode.com/problems/find-indices-with-index-and-value-difference-i/
package algorithms.easy;

public class FindIndicesWithIndexAndValueDifferenceI {
    public static void main(String[] args) {
        FindIndicesWithIndexAndValueDifferenceI indices = new FindIndicesWithIndexAndValueDifferenceI();
        System.out.println("Output:\t" + indices.findIndices(new int[]{5, 1, 4, 1}, 2, 4));
        System.out.println("Output:\t" + indices.findIndices(new int[]{2, 1}, 0, 0));
        System.out.println("Output:\t" + indices.findIndices(new int[]{1, 2, 3}, 2, 4));
    }

    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int min = 0;
        int max = 0;

        for (int i = indexDifference; i < nums.length; i++) {
            int curr = i - indexDifference;
            if (nums[curr] < nums[min]) min = curr;
            if (nums[curr] > nums[max]) max = curr;
            if (nums[i] - nums[min] >= valueDifference) return new int[]{min, i};
            if (nums[max] - nums[i] >= valueDifference) return new int[]{max, i};
        }
        return new int[]{-1, -1};
    }
}
