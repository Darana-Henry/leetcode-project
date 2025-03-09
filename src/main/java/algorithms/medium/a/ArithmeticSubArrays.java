//https://leetcode.com/problems/arithmetic-subarrays/
package algorithms.medium.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubArrays {
    public static void main(String[] args) {
        ArithmeticSubArrays obj = new ArithmeticSubArrays();
        System.out.println("Output:\t" + obj.checkArithmeticSubArrays(new int[]{4, 6, 5, 9, 3, 7}, new int[]{0, 0, 2},
                new int[]{2, 3, 5}));
        System.out.println(
                "Output:\t" + obj.checkArithmeticSubArrays(new int[]{-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10},
                        new int[]{0, 1, 6, 4, 8, 7}, new int[]{4, 4, 9, 7, 9, 10}));
    }

    public List<Boolean> checkArithmeticSubArrays(int[] nums, int[] l, int[] r) {
        List<Boolean> answer = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int[] curr = new int[r[i] - l[i] + 1];
            System.arraycopy(nums, l[i], curr, 0, curr.length);
            answer.add(check(curr));
        }

        return answer;
    }

    public boolean check(int[] curr) {
        Arrays.sort(curr);
        int diff = curr[1] - curr[0];
        for (int i = 2; i < curr.length; i++)
            if (curr[i] - curr[i - 1] != diff) return false;
        return true;
    }
}
