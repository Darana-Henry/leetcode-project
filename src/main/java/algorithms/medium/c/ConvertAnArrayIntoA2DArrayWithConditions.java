//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
package algorithms.medium.c;

import java.util.ArrayList;
import java.util.List;

public class ConvertAnArrayIntoA2DArrayWithConditions {
    public static void main(String[] args) {
        ConvertAnArrayIntoA2DArrayWithConditions obj = new ConvertAnArrayIntoA2DArrayWithConditions();
        System.out.println("Output:\t" + obj.findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1}));
        System.out.println("Output:\t" + obj.findMatrix(new int[]{1, 2, 3, 4}));
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        List<List<Integer>> answer = new ArrayList<>();

        for (int num : nums)
            count[num]++;

        for (int i = 1; i <= n; i++) {
            int freq = count[i];

            for (int j = 0; j < freq; j++) {
                if (answer.size() <= j) answer.add(new ArrayList<>());
                answer.get(j).add(i);
            }
        }

        return answer;
    }
}
