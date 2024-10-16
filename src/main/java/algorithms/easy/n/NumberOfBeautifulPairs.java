//https://leetcode.com/problems/number-of-beautiful-pairs/
package algorithms.easy.n;

public class NumberOfBeautifulPairs {
    public static void main(String[] args) {
        NumberOfBeautifulPairs pairs = new NumberOfBeautifulPairs();
        System.out.println("Output:\t" + pairs.countBeautifulPairs(new int[]{2, 5, 1, 4}));
        System.out.println("Output:\t" + pairs.countBeautifulPairs(new int[]{11, 21, 12}));
    }

    public int countBeautifulPairs(int[] nums) {
        int answer = 0;
        int[] count = new int[10];

        for (int num : nums) {
            for (int i = 0; i < 10; i++)
                if (count[i] > 0 && gcd(num % 10, i) == 1) answer += count[i];
            while (num > 9) num /= 10;
            count[num]++;
        }
        return answer;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
