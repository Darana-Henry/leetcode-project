//https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/
package algorithms.medium.m;

public class MinimumLimitOfBallsInABag {
    public static void main(String[] args) {
        MinimumLimitOfBallsInABag minimumLimitOfBallsInABag = new MinimumLimitOfBallsInABag();
        System.out.println("Output:\t" + minimumLimitOfBallsInABag.minimumSize(new int[]{9}, 2));
        System.out.println("Output:\t" + minimumLimitOfBallsInABag.minimumSize(new int[]{2, 4, 8, 2}, 4));
    }

    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 0;

        for (int num : nums)
            right = Math.max(right, num);

        while (left < right) {
            int mid = (left + right) >> 1;

            long ops = 0;
            for (int num : nums)
                ops += (num - 1) / mid;

            if (ops <= maxOperations) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
