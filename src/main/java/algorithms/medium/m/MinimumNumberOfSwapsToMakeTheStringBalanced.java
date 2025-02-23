//https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
package algorithms.medium.m;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public static void main(String[] args) {
        MinimumNumberOfSwapsToMakeTheStringBalanced obj = new MinimumNumberOfSwapsToMakeTheStringBalanced();
        System.out.println("Output:\t" + obj.minSwaps("][]["));
        System.out.println("Output:\t" + obj.minSwaps("]]][[["));
        System.out.println("Output:\t" + obj.minSwaps("[]"));
    }

    public int minSwaps(String s) {
        int answer = 0;

        for (char ch : s.toCharArray())
            if (ch == '[') answer++;
            else if (answer > 0) answer--;

        return (answer + 1) / 2;
    }
}
