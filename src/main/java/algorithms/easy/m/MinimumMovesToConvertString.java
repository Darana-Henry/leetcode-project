//https://leetcode.com/problems/minimum-moves-to-convert-string/
package algorithms.easy.m;

public class MinimumMovesToConvertString {
    public static void main(String[] args) {
        MinimumMovesToConvertString convert = new MinimumMovesToConvertString();
        System.out.println("Output:\t" + convert.minimumMoves("XXX"));
        System.out.println("Output:\t" + convert.minimumMoves("XXOX"));
        System.out.println("Output:\t" + convert.minimumMoves("OOOO"));
    }

    public int minimumMoves(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                answer++;
                i += 2;
            }
        }
        return answer;
    }
}
