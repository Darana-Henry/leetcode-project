//https://leetcode.com/problems/count-special-quadruplets/
package algorithms.easy.c;

public class CountSpecialQuadruplets {
    public static void main(String[] args) {
        CountSpecialQuadruplets quadruplets = new CountSpecialQuadruplets();
        System.out.println("Output:\t" + quadruplets.countQuadruplets(new int[]{1, 2, 3, 6}));
        System.out.println("Output:\t" + quadruplets.countQuadruplets(new int[]{3, 3, 6, 4, 5}));
        System.out.println("Output:\t" + quadruplets.countQuadruplets(new int[]{1, 1, 1, 3, 5}));
    }

    public int countQuadruplets(int[] nums) {
        int answer = 0;
        int n = nums.length;
        int[] diffs = new int[310];

        for (int b = n - 3; b > 0; b--) {
            int c = b + 1;

            for (int d = c + 1; d < n; d++) {
                int diff = nums[d] - nums[c];
                if (diff >= 0) diffs[diff]++;
            }

            for (int a = 0; a < b; a++) {
                int sum = nums[a] + nums[b];
                answer += diffs[sum];
            }
        }

        return answer;
    }
}
