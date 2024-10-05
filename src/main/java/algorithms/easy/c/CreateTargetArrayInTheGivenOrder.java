//https://leetcode.com/problems/create-target-array-in-the-given-order/
package algorithms.easy.c;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        CreateTargetArrayInTheGivenOrder taxes = new CreateTargetArrayInTheGivenOrder();
        System.out.println("Output:\t" + taxes.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));
        System.out.println("Output:\t" + taxes.createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}));
        System.out.println("Output:\t" + taxes.createTargetArray(new int[]{1}, new int[]{0}));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(index[i], nums[i]);

        for (int i = 0; i < n; i++)
            answer[i] = list.get(i);

        return answer;
    }
}
