//https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
package algorithms.easy.m;

public class MostFrequentNumberFollowingKeyInAnArray {
    public static void main(String[] args) {
        MostFrequentNumberFollowingKeyInAnArray frequent = new MostFrequentNumberFollowingKeyInAnArray();
        System.out.println("Output:\t" + frequent.mostFrequent(new int[]{1, 100, 200, 1, 100}, 1));
        System.out.println("Output:\t" + frequent.mostFrequent(new int[]{2, 2, 2, 2, 3}, 2));
    }

    public int mostFrequent(int[] nums, int key) {
        int[] count = new int[1001];
        int answer = 0, maxCount = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                count[nums[i + 1]]++;

                if (maxCount < count[nums[i + 1]]) {
                    maxCount = count[nums[i + 1]];
                    answer = nums[i + 1];
                }
            }
        }

        return answer;
    }
}
