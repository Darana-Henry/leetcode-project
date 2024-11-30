//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/
package algorithms.easy.m;

public class MaximumValueOfAnOrderedTripletI {
    public static void main(String[] args) {
        MaximumValueOfAnOrderedTripletI triplet = new MaximumValueOfAnOrderedTripletI();
        System.out.println("Output:\t" + triplet.maximumTripletValue(new int[]{12, 6, 1, 2, 7}));
        System.out.println("Output:\t" + triplet.maximumTripletValue(new int[]{1, 10, 3, 4, 19}));
        System.out.println("Output:\t" + triplet.maximumTripletValue(new int[]{1, 2, 3}));
    }

    public long maximumTripletValue(int[] nums) {
        long answer = 0, val = 0, diff = 0;
        for (int num : nums) {
            answer = Math.max(answer, num * diff);
            val = Math.max(val, num);
            diff = Math.max(diff, val - num);
        }
        return answer;
    }
}
