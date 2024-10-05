//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
package algorithms.easy.c;

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
        List<Integer> ex2 = new ArrayList<>();
        ex2.add(-6);
        ex2.add(2);
        ex2.add(5);
        ex2.add(-2);
        ex2.add(-7);
        ex2.add(-1);
        ex2.add(3);
        System.out.println("Output:\t" + count.countPairsBinarySearch(ex1, 2));
        System.out.println("Output:\t" + count.countPairsBinarySearch(ex1, 2));
        System.out.println("Output:\t" + count.countPairsTwoPointers(ex2, 2));
        System.out.println("Output:\t" + count.countPairsTwoPointers(ex2, 2));
    }

    public int countPairsBinarySearch(List<Integer> nums, int target) {
        int answer = 0, left = 0, right = nums.size() - 1;
        nums.sort((a, b) -> a - b);
        while (left != right) {
            if (nums.get(left) + nums.get(right) < target) {
                answer += right - left;
                left++;
            } else right--;
        }
        return answer;
    }

    public int countPairsTwoPointers(List<Integer> nums, int target) {
        int answer = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) answer++;
            }
        }
        return answer;
    }
}
