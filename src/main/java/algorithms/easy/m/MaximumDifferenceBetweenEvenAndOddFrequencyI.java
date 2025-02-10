//https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/
package algorithms.easy.m;

public class MaximumDifferenceBetweenEvenAndOddFrequencyI {
    public static void main(String[] args) {
        MaximumDifferenceBetweenEvenAndOddFrequencyI obj = new MaximumDifferenceBetweenEvenAndOddFrequencyI();
        System.out.println("Output:\t" + obj.maxDifference("aaaaabbc"));
        System.out.println("Output:\t" + obj.maxDifference("abcabcab"));
    }

    public int maxDifference(String s) {
        int odd = Integer.MIN_VALUE, even = Integer.MAX_VALUE;
        int[] count = new int[26];

        for (char ch : s.toCharArray())
            count[ch - 'a']++;

        for (int c : count) {
            if (c % 2 == 0 && c != 0) even = Math.min(even, c);
            else odd = Math.max(odd, c);
        }

        if (odd == Integer.MIN_VALUE || even == Integer.MAX_VALUE) return 0;
        return odd - even;
    }
}
