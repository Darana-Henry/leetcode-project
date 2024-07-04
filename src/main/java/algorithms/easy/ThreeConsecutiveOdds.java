//https://leetcode.com/problems/three-consecutive-odds/description/
package algorithms.easy;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        ThreeConsecutiveOdds threeConsecutive = new ThreeConsecutiveOdds();
        System.out.println("Output:\t" + threeConsecutive.threeConsecutiveOdds(new int[]{2, 6, 4, 1}));
        System.out.println(
                "Output:\t" + threeConsecutive.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));

    }

    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0)
                count++;
            else
                count = 0;

            if (count == 3)
                return true;
        }

        return false;
    }
}
