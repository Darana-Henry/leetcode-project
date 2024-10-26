//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package algorithms.easy.h;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber smaller = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        System.out.println("Output:\t" + smaller.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
        System.out.println("Output:\t" + smaller.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}));
        System.out.println("Output:\t" + smaller.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[102];
        int[] answer = new int[n];

        for (int num : nums)
            count[num + 1]++;

        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        for (int i = 0; i < n; i++)
            answer[i] = count[nums[i]];

        return answer;
    }
}
