//https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
package algorithms.easy;

import algorithms.medium.SnakesAndLadders;

public class DistributeElementsIntoTwoArraysI {

    public static void main(String[] args) {
        DistributeElementsIntoTwoArraysI distribute = new DistributeElementsIntoTwoArraysI();
        System.out.println("Output:\t" + distribute.resultArray(new int[]{2, 1, 3}));
        System.out.println("Output:\t" + distribute.resultArray(new int[]{5, 4, 3, 8}));
    }

    public int[] resultArray(int[] nums) {
        int[] a1 = new int[nums.length];
        int[] a2 = new int[nums.length];
        a1[0] = nums[0];
        a2[0] = nums[1];
        int index1 = 0;
        int index2 = 0;

        for (int i = 2; i < nums.length; i++) {
            if (a1[index1] > a2[index2]) a1[++index1] = nums[i];
            else a2[++index2] = nums[i];
        }

        for (int num : a2)
            if (num != 0) a1[++index1] = num;

        return a1;
    }
}
