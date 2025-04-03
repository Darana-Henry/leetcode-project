//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/
package algorithms.medium.m;

public class MaximumValueOfAnOrderedTripletII {
    public static void main(String[] args) {
        MaximumValueOfAnOrderedTripletII obj = new MaximumValueOfAnOrderedTripletII();
        System.out.println("Output:\t" + obj.maximumTripletValue(new int[]{12, 6, 1, 2, 7}));
        System.out.println("Output:\t" + obj.maximumTripletValue(new int[]{1, 10, 3, 4, 19}));
        System.out.println("Output:\t" + obj.maximumTripletValue(new int[]{1, 2, 3}));
    }

    public long maximumTripletValue(int[] nums) {
        long res = 0;
        long imax = 0, dmax = 0;

        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res, dmax * nums[i]);
            dmax = Math.max(dmax, imax - nums[i]);
            imax = Math.max(imax, nums[i]);
        }

        return res;
    }
}
