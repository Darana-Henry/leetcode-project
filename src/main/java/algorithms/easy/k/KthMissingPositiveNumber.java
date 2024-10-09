//https://leetcode.com/problems/kth-missing-positive-number/
package algorithms.easy.k;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        KthMissingPositiveNumber missing = new KthMissingPositiveNumber();
        System.out.println("Output:\t" + missing.findKthPositiveOptimized(new int[]{2, 3, 4, 7, 11}, 5));
        System.out.println("Output:\t" + missing.findKthPositiveOptimized(new int[]{2, 3, 4, 7, 11}, 5));
        System.out.println("Output:\t" + missing.findKthPositive(new int[]{1, 2, 3, 4}, 2));
        System.out.println("Output:\t" + missing.findKthPositive(new int[]{1, 2, 3, 4}, 2));
    }

    public int findKthPositiveOptimized(int[] arr, int k) {
        for (int i : arr) {
            if (i <= k) k++;
            else break;
        }
        return k;
    }

    public int findKthPositive(int[] arr, int k) {
        if (arr[0] > k) return k;
        int l = 0, r = arr.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] - m - 1 >= k) r = m;
            else l = m + 1;
        }
        return arr[l - 1] + k - (arr[l - 1] - (l - 1) - 1);
    }
}
