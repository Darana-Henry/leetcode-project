//https://leetcode.com/problems/sum-of-digits-in-base-k/
package algorithms.easy.s;

public class SumOfDigitsInBaseK {
    public static void main(String[] args) {
        SumOfDigitsInBaseK base = new SumOfDigitsInBaseK();
        System.out.println("Output:\t" + base.sumBase(34, 6));
        System.out.println("Output:\t" + base.sumBase(10, 10));
    }

    public int sumBase(int n, int k) {
        int answer = 0;
        while (n > 0) {
            answer += n % k;
            n /= k;
        }
        return answer;
    }
}
