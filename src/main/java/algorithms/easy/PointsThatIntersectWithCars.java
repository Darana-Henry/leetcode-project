//https://leetcode.com/problems/points-that-intersect-with-cars/
package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class PointsThatIntersectWithCars {
    public static void main(String[] args) {
        PointsThatIntersectWithCars intersect = new PointsThatIntersectWithCars();
        List<List<Integer>> nums1 = new ArrayList<>();
        List<Integer> nums11 = new ArrayList<>();
        List<Integer> nums12 = new ArrayList<>();
        List<Integer> nums13 = new ArrayList<>();
        nums11.add(3);
        nums11.add(6);
        nums12.add(1);
        nums12.add(5);
        nums13.add(4);
        nums13.add(7);
        nums1.add(nums11);
        nums1.add(nums12);
        nums1.add(nums13);
        System.out.println("Output:\t" + intersect.numberOfPoints(nums1));
        List<List<Integer>> nums2 = new ArrayList<>();
        List<Integer> nums21 = new ArrayList<>();
        List<Integer> nums22 = new ArrayList<>();
        nums21.add(1);
        nums21.add(3);
        nums22.add(5);
        nums22.add(8);
        nums2.add(nums21);
        nums2.add(nums22);
        System.out.println("Output:\t" + intersect.numberOfPoints(nums2));
    }

    public int numberOfPoints(List<List<Integer>> nums) {
        int answer = 0;
        int coverage = 0;
        int[] delta = new int[110];

        for (List<Integer> num : nums) {
            delta[num.get(0)]++;
            delta[num.get(1) + 1]--;
        }

        for (int num : delta) {
            coverage += num;
            if (coverage > 0) answer++;
        }
        return answer;
    }
}
