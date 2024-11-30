//https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
package algorithms.easy.c;

public class CountEqualAndDivisiblePairsInAnArray {
    public static void main(String[] args) {
        CountEqualAndDivisiblePairsInAnArray divisible = new CountEqualAndDivisiblePairsInAnArray();
        System.out.println("Output:\t" + divisible.countPairs(new int[]{3, 1, 2, 2, 2, 1, 3}, 2));
        System.out.println("Output:\t" + divisible.countPairs(new int[]{1, 2, 3, 4}, 1));
    }

    public int countPairs(int[] nums, int k) {
        int answer = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) answer++;
            }
        }
        return answer;
    }
}
