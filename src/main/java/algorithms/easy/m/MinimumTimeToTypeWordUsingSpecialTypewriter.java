//https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/
package algorithms.easy.m;

public class MinimumTimeToTypeWordUsingSpecialTypewriter {
    public static void main(String[] args) {
        MinimumTimeToTypeWordUsingSpecialTypewriter typewriter = new MinimumTimeToTypeWordUsingSpecialTypewriter();
        System.out.println("Output:\t" + typewriter.minTimeToType("abc"));
        System.out.println("Output:\t" + typewriter.minTimeToType("bza"));
        System.out.println("Output:\t" + typewriter.minTimeToType("zjpc"));
    }

    public int minTimeToType(String word) {
        int answer = 0;
        int prev = 0;
        for (char ch : word.toCharArray()) {
            int curr = ch - 'a';
            int clock = Math.abs(curr - prev);
            int counter = Math.abs(26 - clock);
            answer += (Math.min(clock, counter) + 1);
            prev = curr;
        }
        return answer;
    }
}
