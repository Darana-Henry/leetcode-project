//https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/
package algorithms.easy.c;

import java.util.ArrayList;
import java.util.List;

public class ConstructTheMinimumBitwiseArrayI {

    public static void main(String[] args) {
        ConstructTheMinimumBitwiseArrayI minBit = new ConstructTheMinimumBitwiseArrayI();
        List<Integer> ex1 = new ArrayList<>();
        ex1.add(2);
        ex1.add(3);
        ex1.add(5);
        ex1.add(7);
        List<Integer> ex2 = new ArrayList<>();
        ex2.add(11);
        ex2.add(13);
        ex2.add(31);
        System.out.println("Output:\t" + minBit.minBitwiseArray(ex1));
        System.out.println("Output:\t" + minBit.minBitwiseArray(ex2));
    }

    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= nums.get(i); j++) {
                if ((j | (j + 1)) == nums.get(i)) {
                    answer[i] = j;
                    break;
                }
            }
            if (answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }
}
