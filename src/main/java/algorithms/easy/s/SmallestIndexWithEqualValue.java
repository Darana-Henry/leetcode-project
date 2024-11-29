//https://leetcode.com/problems/smallest-index-with-equal-value/
package algorithms.easy.s;

public class SmallestIndexWithEqualValue {
    public static void main(String[] args) {
        SmallestIndexWithEqualValue smallest = new SmallestIndexWithEqualValue();
        System.out.println("Output:\t" + smallest.smallestEqual(new int[]{0, 1, 2}));
        System.out.println("Output:\t" + smallest.smallestEqual(new int[]{4, 3, 2, 1}));
        System.out.println("Output:\t" + smallest.smallestEqual(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; ++i)
            if (i % 10 == nums[i]) return i;
        return -1;
    }
}
