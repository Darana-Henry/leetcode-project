//https://leetcode.com/problems/find-the-maximum-divisibility-score/
package algorithms.easy.f;

public class FindTheMaximumDivisibilityScore {
    public static void main(String[] args) {
        FindTheMaximumDivisibilityScore divisibility = new FindTheMaximumDivisibilityScore();
        System.out.println("Output:\t" + divisibility.maxDivScore(new int[]{2, 9, 15, 50}, new int[]{5, 3, 7, 2}));
        System.out.println("Output:\t" + divisibility.maxDivScore(new int[]{4, 7, 9, 3, 9}, new int[]{5, 2, 3}));
        System.out.println("Output:\t" + divisibility.maxDivScore(new int[]{20, 14, 21, 10}, new int[]{10, 16, 20}));
    }

    public int maxDivScore(int[] nums, int[] divisors) {
        int answer = divisors[0], max = 0;
        for (int div : divisors) {
            int curr = 0;
            for (int num : nums)
                if (num % div == 0) curr++;
            if (max < curr || (max == curr && div < answer)) {
                max = curr;
                answer = div;
            }
        }
        return answer;
    }
}
