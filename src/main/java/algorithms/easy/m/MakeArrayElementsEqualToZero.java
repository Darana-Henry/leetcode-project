//https://leetcode.com/problems/make-array-elements-equal-to-zero/
package algorithms.easy.m;

public class MakeArrayElementsEqualToZero {
    public static void main(String[] args) {
        MakeArrayElementsEqualToZero zero = new MakeArrayElementsEqualToZero();
        System.out.println("Output:\t" + zero.countValidSelections(new int[]{1, 0, 2, 0, 3}));
        System.out.println("Output:\t" + zero.countValidSelections(new int[]{2, 3, 4, 0, 4, 1, 0}));
    }

    public int countValidSelections(int[] nums) {
        int n = nums.length, answer = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
            right[n - i - 1] = right[n - i] + nums[n - i];
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue;
            if (left[i] == right[i]) answer += 2;
            if (Math.abs(left[i] - right[i]) == 1) answer += 1;
        }

        return answer;
    }
}
