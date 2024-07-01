//https://leetcode.com/problems/summary-ranges/description/
package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        SummaryRanges range = new SummaryRanges();
        System.out.println("Output:\t" + range.summaryRangesBruteForce(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println("Output:\t" + range.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public List<String> summaryRangesBruteForce(int[] nums) {
        if (nums.length == 0)
            return new ArrayList<>();

        List<String> result = new ArrayList<>();
        int left = nums[0];
        int right = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (right + 1 == nums[i])
                right = nums[i];
            else {
                result.add(left == right ? left + "" : left + "->" + right);
                left = nums[i];
                right = nums[i];
            }
        }
        result.add(left == right ? left + "" : left + "->" + right);
        return result;
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while ((i + 1 < nums.length) && (nums[i] + 1 == nums[i + 1]))
                i++;

            result.add(start == nums[i] ? start + "" : start + "->" + nums[i]);
        }
        return result;
    }
}
