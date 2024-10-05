package algorithms.easy.m;//https://leetcode.com/problems/majority-element/description/

public class MajorityElement {

    public static void main(String[] args) {

        MajorityElement majorityElement = new MajorityElement();

        System.out.println("Output:\t" + majorityElement.majorityElement(new int[]{3, 2, 3}));
        System.out.println("Output:\t" + majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public int majorityElement(int[] nums) {
        int votes = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (votes == 0)
                candidate = nums[i];
            if (candidate == nums[i])
                votes++;
            else
                votes--;
        }
        return candidate;
    }
}
