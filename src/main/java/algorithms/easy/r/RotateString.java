//https://leetcode.com/problems/rotate-string/
package algorithms.easy.r;

public class RotateString {
    public static void main(String[] args) {
        RotateString rotate = new RotateString();
        System.out.println("Output:\t" + rotate.rotateString("abcde", "cdeab"));
        System.out.println("Output:\t" + rotate.rotateString("abcde", "abced"));
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
