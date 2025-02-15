//https://leetcode.com/problems/minimum-operations-to-make-array-equal/
package algorithms.medium.m;

public class MinimumOperationsToMakeArrayEqual {
    public static void main(String[] args) {
        MinimumOperationsToMakeArrayEqual obj = new MinimumOperationsToMakeArrayEqual();
        System.out.println("Output:\t" + obj.minOperations(3));
        System.out.println("Output:\t" + obj.minOperations(6));
    }

    public int minOperations(int n) {
        int answer = 0;
        for (int i = 0; i < n / 2; i++)
            answer += n - ((i * 2) + 1);
        return answer;
    }
}
