//https://leetcode.com/problems/minimum-number-of-operations-to-reinitialize-a-permutation/
package algorithms.medium.m;

public class MinimumNumberOfOperationsToReinitializeAPermutation {
    public static void main(String[] args) {
        MinimumNumberOfOperationsToReinitializeAPermutation obj = new MinimumNumberOfOperationsToReinitializeAPermutation();
        System.out.println("Output:\t" + obj.reinitializePermutation(2));
        System.out.println("Output:\t" + obj.reinitializePermutation(4));
        System.out.println("Output:\t" + obj.reinitializePermutation(6));
    }

    public int reinitializePermutation(int n) {
        int answer = 0, index = 1;

        while (true) {
            answer++;
            if (index < n / 2) index *= 2;
            else index = (index - n / 2) * 2 + 1;
            if (index == 1) break;
        }

        return answer;
    }
}
