//https://leetcode.com/problems/intersection-of-multiple-arrays/
package algorithms.easy.i;

import java.util.List;
import java.util.ArrayList;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        IntersectionOfMultipleArrays intersection = new IntersectionOfMultipleArrays();
        System.out.println(
                "Output:\t" + intersection.intersection(new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}));
        System.out.println("Output:\t" + intersection.intersection(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    public List<Integer> intersection(int[][] nums) {
        int[] count = new int[1001];
        List<Integer> answer = new ArrayList<>();

        for (int[] num : nums)
            for (int n : num)
                count[n]++;

        for (int i = 0; i < 1001; i++) {
            if (count[i] == nums.length) answer.add(i);
        }

        return answer;
    }
}
