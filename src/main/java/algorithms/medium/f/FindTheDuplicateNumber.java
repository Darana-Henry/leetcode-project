//https://leetcode.com/problems/find-the-duplicate-number/
package algorithms.medium.f;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        FindTheDuplicateNumber duplicate = new FindTheDuplicateNumber();
        System.out.println("Output:\t" + duplicate.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        System.out.println("Output:\t" + duplicate.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        System.out.println("Output:\t" + duplicate.findDuplicate(new int[]{3, 3, 3, 3, 3}));
    }

    public int findDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            int count = 0;

            for (int num : nums)
                if (num <= m) count++;

            if (count > m) r = m;
            else l = m + 1;

        }
        return l;
    }
}
