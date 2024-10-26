//https://leetcode.com/problems/maximum-number-of-balloons/
package algorithms.easy.m;

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        MaximumNumberOfBalloons balloons = new MaximumNumberOfBalloons();
        System.out.println("Output:\t" + balloons.maxNumberOfBalloons("nlaebolko"));
        System.out.println("Output:\t" + balloons.maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println("Output:\t" + balloons.maxNumberOfBalloons("leetcode"));
    }

    public int maxNumberOfBalloons(String text) {
        int answer = Integer.MAX_VALUE;
        int[] count = new int[26];

        for (char ch : text.toCharArray())
            count[ch - 'a']++;

        count['l' - 'a'] >>= 1;
        count['o' - 'a'] >>= 1;

        for (char ch : "balon".toCharArray())
            answer = Math.min(answer, count[ch - 'a']);

        return answer;
    }
}
