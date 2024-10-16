//https://leetcode.com/problems/prime-in-diagonal/
package algorithms.easy.p;

public class PrimeInDiagonal {
    public static void main(String[] args) {
        PrimeInDiagonal diagonal = new PrimeInDiagonal();
        System.out.println("Output:\t" + diagonal.diagonalPrime(new int[][]{{1, 2, 3}, {5, 6, 7}, {9, 10, 11}}));
        System.out.println("Output:\t" + diagonal.diagonalPrime(new int[][]{{1, 2, 3}, {5, 17, 7}, {9, 11, 10}}));
    }

    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i])) max = Math.max(max, nums[i][i]);
            if (isPrime(nums[i][n - i - 1])) max = Math.max(max, nums[i][n - i - 1]);
        }
        return max;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++)
            if (n % i == 0) return false;
        return true;
    }
}
