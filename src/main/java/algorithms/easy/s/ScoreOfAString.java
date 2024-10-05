//https://leetcode.com/problems/score-of-a-string/description/
package algorithms.easy.s;

public class ScoreOfAString {
    public static void main(String[] args) {

        ScoreOfAString score = new ScoreOfAString();
        System.out.println("Output:\t" + score.scoreOfString("hello"));
        System.out.println("Output:\t" + score.scoreOfString("zaz"));
    }

    public int scoreOfString(String s) {
        int previous = -1;
        int sum = 0;
        for (char c : s.toCharArray()) {
            int current = (int) c;
            if (previous != -1)
                sum += Math.abs(previous - current);
            previous = current;
        }
        return sum;
    }

    public int scoreOfStringFaster(String s) {
        int sum = 0;
        for (int i = 1; i < s.length(); i++)
            sum += Math.abs(s.charAt(i - 1) - s.charAt(i));
        return sum;
    }
}
