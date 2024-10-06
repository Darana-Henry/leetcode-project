//https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-i/
package algorithms.easy.s;

public class ShortestSubarrayWithORAtLeastKI {
    public static void main(String[] args) {
        ShortestSubarrayWithORAtLeastKI shortest = new ShortestSubarrayWithORAtLeastKI();
        System.out.println("Output:\t" + shortest.minimumSubarrayLength(new int[]{1, 2, 3}, 2));
        System.out.println("Output:\t" + shortest.minimumSubarrayLength(new int[]{2, 1, 8}, 10));
        System.out.println("Output:\t" + shortest.minimumSubarrayLength(new int[]{1, 2}, 0));
    }

    public int minimumSubarrayLength(int[] nums, int k) {
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp |= nums[j];
                if (temp >= k) answer = Math.min(answer, j - i + 1);
            }
        }
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}
