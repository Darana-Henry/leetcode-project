//https://leetcode.com/problems/split-the-array/
package algorithms.easy.s;

public class SplitTheArray {
    public static void main(String[] args) {
        SplitTheArray split = new SplitTheArray();
        System.out.println("Output:\t" + split.isPossibleToSplit(new int[]{1, 1, 2, 2, 3, 4}));
        System.out.println("Output:\t" + split.isPossibleToSplit(new int[]{1, 1, 1, 1}));
    }

    public boolean isPossibleToSplit(int[] nums) {
        int[] counts = new int[101];

        for (int num : nums) {
            counts[num]++;
            if (counts[num] >= 3) return false;
        }
        return true;
    }
}
