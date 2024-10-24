//https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/
package algorithms.easy.m;

public class MinimumNumberOfPushesToTypeWordI {
    public static void main(String[] args) {
        MinimumNumberOfPushesToTypeWordI push = new MinimumNumberOfPushesToTypeWordI();
        System.out.println("Output:\t" + push.minimumPushes("abcde"));
        System.out.println("Output:\t" + push.minimumPushes("xycdefghij"));
    }

    public int minimumPushes(String word) {
        int n = word.length();
        int answer = 0, multiplier = 1;

        for (int i = 0; i < n / 8; i++) {
            answer += multiplier * 8;
            multiplier++;
        }

        answer += multiplier * (n % 8);
        return answer;
    }
}
