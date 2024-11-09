//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package algorithms.easy.f;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits even = new FindNumbersWithEvenNumberOfDigits();
        System.out.println("Output:\t" + even.findNumbers(new int[]{12, 345, 2, 6, 7896}));
        System.out.println("Output:\t" + even.findNumbers(new int[]{555, 901, 482, 1771}));
    }

    public int findNumbers(int[] nums) {
        int answer = 0;
        for (int num : nums)
            if (String.valueOf(num).length() % 2 == 0) answer++;
        return answer;
    }
}
