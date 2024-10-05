//https://leetcode.com/problems/sort-array-by-parity-ii/
package algorithms.easy.s;

public class SortArrayByParityII {
    public static void main(String[] args) {
        SortArrayByParityII parity = new SortArrayByParityII();
        System.out.println("Output:\t" + parity.sortArrayByParityII(new int[]{4, 2, 5, 7}));
        System.out.println("Output:\t" + parity.sortArrayByParityII(new int[]{2, 3}));
    }

    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;

        while (even < nums.length) {
            if ((nums[even] & 1) != 0) {
                while ((nums[odd] & 1) != 0) {
                    odd += 2;
                }
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
            }
            even += 2;
        }
        return nums;
    }
}
