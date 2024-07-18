//https://leetcode.com/problems/valid-perfect-square/description/
package algorithms.easy;

import algorithms.medium.RotateArray;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        ValidPerfectSquare perfect = new ValidPerfectSquare();
        System.out.println("Output:\t" + perfect.isPerfectSquareNewtonMethod(16));
        System.out.println("Output:\t" + perfect.isPerfectSquareBinarySearch(256));
        System.out.println("Output:\t" + perfect.isPerfectSquareBruteForce(14));
    }

    public boolean isPerfectSquareNewtonMethod(int num) {
        long r = num;
        while (r * r > num) {
            r = (r + num / r) / 2;
        }
        return r * r == num;
    }

    public boolean isPerfectSquareBinarySearch(int num) {
        if (num < 1)
            return false;

        long left = 1;
        long right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == num)
                return true;
            else if (mid * mid > num)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }

    public boolean isPerfectSquareBruteForce(int num) {
        for (int i = 1; i <= num; i = i + 2) {
            num -= i;
        }
        return num == 0;
    }
}
