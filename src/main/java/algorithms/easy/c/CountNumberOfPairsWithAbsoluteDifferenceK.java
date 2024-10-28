//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
package algorithms.easy.c;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        CountNumberOfPairsWithAbsoluteDifferenceK difference = new CountNumberOfPairsWithAbsoluteDifferenceK();
        System.out.println("Output:\t" + difference.countKDifference(new int[]{1, 2, 2, 1}, 1));
        System.out.println("Output:\t" + difference.countKDifference(new int[]{1, 3}, 3));
        System.out.println("Output:\t" + difference.countKDifference(new int[]{3, 2, 1, 5, 4}, 2));
    }

    public int countKDifference(int[] nums, int k) {
        int answer = 0;
        int[] count = new int[110];

        for (int num : nums) {
            if (num >= k) answer += count[num - k];
            if (num + k <= 100) answer += count[num + k];
            count[num]++;
        }

        return answer;
    }
}
