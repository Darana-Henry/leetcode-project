//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
package algorithms.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        CountPairsWhoseSumIsLessThanTarget count = new CountPairsWhoseSumIsLessThanTarget();
        List<Integer> ex1 = new ArrayList<>();
        ex1.add(-1);
        ex1.add(1);
        ex1.add(2);
        ex1.add(3);
        ex1.add(1);
        System.out.println("Output:\t" + count.countPairs(ex1, 2));
        List<Integer> ex2 = new ArrayList<>();
        ex2.add(-6);
        ex2.add(2);
        ex2.add(5);
        ex2.add(-2);
        ex2.add(-7);
        ex2.add(-1);
        ex2.add(3);
        System.out.println("Output:\t" + count.countPairs(ex2, 2));
    }

    public int countPairs(List<Integer> nums, int target) {
        int pairs = 0;
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum < target) {
                pairs++;
                left++;
            } else right--;
        }

        return pairs;
    }
}
