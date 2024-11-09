//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
package algorithms.easy.f;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        FindNUniqueIntegersSumUpToZero zero = new FindNUniqueIntegersSumUpToZero();
        System.out.println("Output:\t" + zero.sumZero(5));
        System.out.println("Output:\t" + zero.sumZero(3));
        System.out.println("Output:\t" + zero.sumZero(1));
    }

    public int[] sumZero(int n) {
        int[] answer = new int[n];

        for (int i = 1; i < n; i++)
            answer[i] = i;

        answer[0] = -((n * (n - 1)) / 2);
        return answer;
    }
}
