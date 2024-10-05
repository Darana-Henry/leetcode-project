//https://leetcode.com/problems/separate-the-digits-in-an-array/
package algorithms.easy.s;

import java.util.ArrayList;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    public static void main(String[] args) {
        SeparateTheDigitsInAnArray separate = new SeparateTheDigitsInAnArray();
        System.out.println("Output:\t" + separate.separateDigits(new int[]{13, 25, 83, 77}));
        System.out.println("Output:\t" + separate.separateDigits(new int[]{7, 1, 3, 9}));
    }

    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            List<Integer> curr = new ArrayList<>();
            while (num != 0) {
                curr.add(num % 10);
                num /= 10;
            }

            for (int j = curr.size() - 1; j >= 0; j--) {
                list.add(curr.get(j));
            }
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            array[i] = list.get(i);
        return array;
    }
}
