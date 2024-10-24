//https://leetcode.com/problems/k-items-with-the-maximum-sum/
package algorithms.easy.k;

public class KItemsWithTheMaximumSum {
    public static void main(String[] args) {
        KItemsWithTheMaximumSum maxSum = new KItemsWithTheMaximumSum();
        System.out.println("Output:\t" + maxSum.kItemsWithMaximumSum(3, 2, 0, 2));
        System.out.println("Output:\t" + maxSum.kItemsWithMaximumSum(3, 2, 0, 4));
    }

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (numOnes >= k) return k;
        if (numZeros >= (k - numOnes)) return numOnes;
        return numOnes - (k - numOnes - numZeros);
    }
}
