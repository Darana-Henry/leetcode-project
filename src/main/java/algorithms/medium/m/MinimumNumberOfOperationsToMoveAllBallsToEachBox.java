//https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
package algorithms.medium.m;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        MinimumNumberOfOperationsToMoveAllBallsToEachBox obj = new MinimumNumberOfOperationsToMoveAllBallsToEachBox();
        System.out.println("Output:\t" + obj.minOperations("110"));
        System.out.println("Output:\t" + obj.minOperations("001011"));
    }

    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        for (int i = 1, count = 0; i < n; i++) {
            if (boxes.charAt(i - 1) == '1') count++;
            answer[i] = answer[i - 1] + count;
        }

        for (int i = n - 2, count = 0, sum = 0; i >= 0; i--) {
            if (boxes.charAt(i + 1) == '1') count++;

            sum += count;
            answer[i] += sum;
        }

        return answer;
    }
}
