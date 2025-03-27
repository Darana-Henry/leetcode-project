//https://leetcode.com/problems/minimum-index-of-a-valid-split/
package algorithms.medium.m;

import java.util.Arrays;
import java.util.List;

public class MinimumIndexOfAValidSplit {
    public static void main(String[] args) {
        MinimumIndexOfAValidSplit obj = new MinimumIndexOfAValidSplit();
        System.out.println("Output:\t" + obj.minimumIndex(Arrays.asList(1, 2, 2, 2)));
        System.out.println("Output:\t" + obj.minimumIndex(Arrays.asList(2, 1, 3, 1, 1, 1, 7, 1, 2, 1)));
        System.out.println("Output:\t" + obj.minimumIndex(Arrays.asList(3, 3, 3, 3, 7, 2, 2)));
    }

    public int minimumIndex(List<Integer> nums) {
        int x = nums.get(0), count = 0, xC = 0, n = nums.size();

        for (int num : nums) {
            if (x == num) count++;
            else count--;
            if (count == 0) {
                x = num;
                count = 1;
            }
        }

        for (int num : nums)
            if (num == x) xC++;

        count = 0;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == x) count++;
            int rem = xC - count;
            if (count * 2 > i + 1 && rem * 2 > n - i - 1) return i;
        }

        return -1;
    }
}
