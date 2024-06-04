//https://leetcode.com/problems/increasing-triplet-subsequence/description/
package algorithms.medium;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {

        IncreasingTripletSubsequence triplet = new IncreasingTripletSubsequence();

        System.out.println("Output:\t" + triplet.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + triplet.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        System.out.println("Output:\t" + triplet.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3)
            return false;

        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for (int in = 0; in < nums.length; in++) {
            if (nums[in] <= i)
                i = nums[in];
            else if (nums[in] <= j)
                j = nums[in];
            else
                return true;
        }
        return false;
    }
}
