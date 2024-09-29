//https://leetcode.com/problems/defuse-the-bomb/
package algorithms.easy;

public class DefuseTheBomb {
    public static void main(String[] args) {
        DefuseTheBomb bomb = new DefuseTheBomb();
        System.out.println("Output:\t" + bomb.decrypt(new int[]{5, 7, 1, 4}, 3));
        System.out.println("Output:\t" + bomb.decrypt(new int[]{1, 2, 3, 4}, 0));
        System.out.println("Output:\t" + bomb.decrypt(new int[]{2, 4, 9, 3}, -2));
    }

    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] answer = new int[n];
        if (k == 0) return answer;
        int[] sum = new int[2 * n + 1];

        for (int i = 0; i < n * 2; i++)
            sum[i + 1] = sum[i] + code[i % n];

        for (int i = 0; i < n; i++) {
            if (k > 0) answer[i] = sum[i + k + 1] - sum[i + 1];
            else answer[i] = sum[i + n] - sum[i + k + n];
        }

        return answer;
    }
}
