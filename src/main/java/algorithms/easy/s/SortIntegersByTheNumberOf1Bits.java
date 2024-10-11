//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
package algorithms.easy.s;

import java.util.Arrays;

public class SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        SortIntegersByTheNumberOf1Bits sort = new SortIntegersByTheNumberOf1Bits();
        System.out.println("Output:\t" + sort.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println("Output:\t" + sort.sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}));
    }

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] += 100000 * Integer.bitCount(arr[i]);

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            arr[i] %= 100000;

        return arr;
    }
}
