//https://leetcode.com/problems/two-out-of-three/
package algorithms.easy.t;

import java.util.ArrayList;
import java.util.List;

public class TwoOutOfThree {
    public static void main(String[] args) {
        TwoOutOfThree out = new TwoOutOfThree();
        System.out.println("Output:\t" + out.twoOutOfThree(new int[]{1, 1, 3, 2}, new int[]{2, 3}, new int[]{3}));
        System.out.println("Output:\t" + out.twoOutOfThree(new int[]{3, 1}, new int[]{2, 3}, new int[]{1, 2}));
        System.out.println("Output:\t" + out.twoOutOfThree(new int[]{1, 2, 2}, new int[]{4, 3, 3}, new int[]{5}));
    }

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] c1 = new boolean[101];
        boolean[] c2 = new boolean[101];
        boolean[] c3 = new boolean[101];
        List<Integer> answer = new ArrayList<>();

        for (int num : nums1)
            c1[num] = true;

        for (int num : nums2)
            c2[num] = true;

        for (int num : nums3)
            c3[num] = true;

        for (int i = 0; i < 101; i++)
            if (c1[i] && (c2[i] || c3[i]) || c2[i] && c3[i]) answer.add(i);

        return answer;
    }
}
