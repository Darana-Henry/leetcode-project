//https://leetcode.com/problems/last-visited-integers/
package algorithms.easy.l;

import java.util.List;
import java.util.ArrayList;

public class LastVisitedIntegers {
    public static void main(String[] args) {
        LastVisitedIntegers visited = new LastVisitedIntegers();
        System.out.println("Output:\t" + visited.lastVisitedIntegers(new int[]{1, 2, -1, -1, -1}));
        System.out.println("Output:\t" + visited.lastVisitedIntegers(new int[]{1, -1, 2, -1, -1}));
    }

    public List<Integer> lastVisitedIntegers(int[] nums) {
        int seen = 0;
        List<Integer> visited = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                seen++;
                int index = positive.size() - seen;
                if (index < 0) visited.add(-1);
                else visited.add(positive.get(index));
            } else {
                seen = 0;
                positive.add(nums[i]);
            }
        }
        return visited;
    }
}
