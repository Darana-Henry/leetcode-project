//https://leetcode.com/problems/count-symmetric-integers/
package algorithms.easy.c;

public class CountSymmetricIntegers {
    public static void main(String[] args) {
        CountSymmetricIntegers symmetric = new CountSymmetricIntegers();
        System.out.println("Output:\t" + symmetric.countSymmetricIntegers(1, 100));
        System.out.println("Output:\t" + symmetric.countSymmetricIntegers(1200, 1230));
    }

    public int countSymmetricIntegers(int low, int high) {
        int answer = 0;

        for (int i = low; i <= high; i++)
            if (isSymmetric(i)) answer++;

        return answer;
    }

    public boolean isSymmetric(int i) {
        String num = Integer.toString(i);
        int n = num.length();
        if (n % 2 == 1) return false;
        int left = 0;
        int right = 0;

        for (int x = 0; x < n / 2; x++)
            left += num.charAt(x) - '0';

        for (int x = n / 2; x < n; x++)
            right += num.charAt(x) - '0';

        return left == right;
    }
}
