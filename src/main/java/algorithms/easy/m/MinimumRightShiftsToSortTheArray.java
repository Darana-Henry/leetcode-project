//https://leetcode.com/problems/minimum-right-shifts-to-sort-the-array/
package algorithms.easy.m;

import java.util.Arrays;
import java.util.List;

public class MinimumRightShiftsToSortTheArray {
    public static void main(String[] args) {
        MinimumRightShiftsToSortTheArray shifts = new MinimumRightShiftsToSortTheArray();
        System.out.println("Output:\t" + shifts.minimumRightShifts(Arrays.asList(3, 4, 5, 1, 2)));
        System.out.println("Output:\t" + shifts.minimumRightShifts(Arrays.asList(1, 3, 5)));
        System.out.println("Output:\t" + shifts.minimumRightShifts(Arrays.asList(2, 1, 4)));
    }

    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size(), index = 0, count = 0;

        for (int i = 1; i < n; i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                index = i;
                count++;
            }
        }

        if (count > 1) return -1;

        if (index == 0) return 0;

        return nums.get(n - 1) > nums.get(0) ? -1 : n - index;
    }
}

