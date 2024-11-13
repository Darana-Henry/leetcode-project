//https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/
package algorithms.easy.t;

public class TheTwoSneakyNumbersOfDigitville {
    public static void main(String[] args) {
        TheTwoSneakyNumbersOfDigitville sneaky = new TheTwoSneakyNumbersOfDigitville();
        System.out.println("Output:\t" + sneaky.getSneakyNumbers(new int[]{0, 1, 1, 0}));
        System.out.println("Output:\t" + sneaky.getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2}));
        System.out.println("Output:\t" + sneaky.getSneakyNumbers(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2}));
    }

    public int[] getSneakyNumbers(int[] nums) {
        int index = 0;
        int[] answer = new int[2];
        int[] count = new int[nums.length - 2];

        for (int num : nums) {
            count[num]++;
            if (count[num] == 2) answer[index++] = num;
        }
        return answer;
    }
}
