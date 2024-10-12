//https://leetcode.com/problems/divide-array-into-equal-pairs/
package algorithms.easy.d;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        DivideArrayIntoEqualPairs pairs = new DivideArrayIntoEqualPairs();
        System.out.println("Output:\t" + pairs.divideArray(new int[]{3, 2, 3, 2, 2, 2}));
        System.out.println("Output:\t" + pairs.divideArray(new int[]{1, 2, 3, 4}));
    }

    public boolean divideArray(int[] nums) {
        int[] counts = new int[510];
        for (int num : nums)
            counts[num]++;

        for (int count : counts)
            if (count % 2 != 0) return false;

        return true;
    }
}
