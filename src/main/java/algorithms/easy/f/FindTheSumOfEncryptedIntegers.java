//https://leetcode.com/problems/find-the-sum-of-encrypted-integers/
package algorithms.easy.f;

public class FindTheSumOfEncryptedIntegers {
    public static void main(String[] args) {
        FindTheSumOfEncryptedIntegers encrypted = new FindTheSumOfEncryptedIntegers();
        System.out.println("Output:\t" + encrypted.sumOfEncryptedInt(new int[]{1, 2, 3}));
        System.out.println("Output:\t" + encrypted.sumOfEncryptedInt(new int[]{10, 21, 31}));
    }

    public int sumOfEncryptedInt(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            int max = 0, digits = 0;

            while (num > 0) {
                max = Math.max(max, num % 10);
                num /= 10;
                digits = digits * 10 + 1;
            }

            answer += digits * max;
        }
        return answer;
    }
}
