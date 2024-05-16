package algorithms.easy;//https://leetcode.com/problems/contains-duplicate/description/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        System.out.println("Output:\t" + duplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }


    public boolean containsDuplicate(int[] nums) {
        boolean duplicateFound = false;
        Set findingDuplicate = new HashSet();

        for (int outerLoop = 0; outerLoop < nums.length; outerLoop++) {

            boolean insertedADuplicate = findingDuplicate.add(nums[outerLoop]);
            if (!insertedADuplicate)
                return true;
        }
        return false;
    }
}
