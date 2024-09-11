//https://leetcode.com/problems/sort-array-by-parity/
package algorithms.easy;

public class SortArrayByParity {
    public static void main(String[] args) {
        SortArrayByParity parity = new SortArrayByParity();
        System.out.println("Output:\t" + parity.sortArrayByParity(new int[]{3, 1, 2, 4}));
        System.out.println("Output:\t" + parity.sortArrayByParity(new int[]{0}));
    }

    public int[] sortArrayByParity(int[] nums) {
        int move2 = nums.length - 1;
        int curr = 0;
        while (curr < move2) {
            if (nums[curr] % 2 != 0) {
                int temp = nums[move2];
                nums[move2] = nums[curr];
                nums[curr] = temp;
                move2--;
            } else curr++;
        }
        return nums;
    }
}
