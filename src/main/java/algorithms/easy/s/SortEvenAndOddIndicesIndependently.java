//https://leetcode.com/problems/sort-even-and-odd-indices-independently/
package algorithms.easy.s;

import java.util.Arrays;

public class SortEvenAndOddIndicesIndependently {
    public static void main(String[] args) {
        SortEvenAndOddIndicesIndependently evenOdd = new SortEvenAndOddIndicesIndependently();
        System.out.println("Output:\t" + evenOdd.sortEvenOdd(new int[]{4, 1, 2, 3}));
        System.out.println("Output:\t" + evenOdd.sortEvenOdd(new int[]{2, 1}));
    }

    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int[] even = new int[(n + 1) >> 1];
        int[] odd = new int[(n) >> 1];
        int[] answer = new int[n];

        for (int i = 0, j = 0; j < n / 2; i += 2, j++) {
            even[j] = nums[i];
            odd[j] = nums[i + 1];
        }

        if (n % 2 == 1) even[even.length - 1] = nums[n - 1];

        Arrays.sort(even);
        Arrays.sort(odd);

        for (int i = 0, j = 0; j < even.length; i += 2, j++)
            answer[i] = even[j];

        for (int i = 1, j = odd.length - 1; j >= 0; i += 2, j--)
            answer[i] = odd[j];

        return answer;
    }
}
