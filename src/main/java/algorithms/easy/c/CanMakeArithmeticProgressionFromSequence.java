//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
package algorithms.easy.c;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        CanMakeArithmeticProgressionFromSequence progression = new CanMakeArithmeticProgressionFromSequence();
        System.out.println("Output:\t" + progression.canMakeArithmeticProgression(new int[]{3, 5, 1}));
        System.out.println("Output:\t" + progression.canMakeArithmeticProgression(new int[]{1, 2, 4}));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++)
            if (arr[i] - arr[i - 1] != diff) return false;

        return true;
    }
}
