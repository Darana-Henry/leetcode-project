//https://leetcode.com/problems/sum-of-even-numbers-after-queries/
package algorithms.medium.s;

public class SumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        SumOfEvenNumbersAfterQueries sumOfEven = new SumOfEvenNumbersAfterQueries();
        System.out.println("Output:\t" + sumOfEven.sumEvenAfterQueries(new int[]{1, 2, 3, 4},
                new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}}));
        System.out.println("Output:\t" + sumOfEven.sumEvenAfterQueries(new int[]{1}, new int[][]{{4, 0}}));
    }

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length, index = 0;
        int[] answer = new int[n];

        for (int[] q : queries) {
            int val = q[0];
            int i = q[1];
            nums[i] += val;
            int result = 0;
            for (int num : nums)
                if (num % 2 == 0) result += num;

            answer[index++] = result;
        }

        return answer;
    }

    public int[] sumEvenAfterQueriesOptimized(int[] nums, int[][] queries) {
        int n = queries.length, index = 0, sum = 0;
        int[] answer = new int[n];

        for (int num : nums)
            if (num % 2 == 0) sum += num;

        for (int[] q : queries) {
            int val = q[0];
            int i = q[1];
            if (nums[i] % 2 == 0) sum -= nums[i];
            nums[i] += val;
            if (nums[i] % 2 == 0) sum += nums[i];
            answer[index++] = sum;
        }

        return answer;
    }
}
