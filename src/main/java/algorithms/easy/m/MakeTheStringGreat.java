//https://leetcode.com/problems/make-the-string-great/
package algorithms.easy.m;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        MakeTheStringGreat great = new MakeTheStringGreat();
        System.out.println("Output:\t" + great.makeGood("leEeetcode"));
        System.out.println("Output:\t" + great.makeGood("abBAcC"));
        System.out.println("Output:\t" + great.makeGood("s"));
    }

    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.length() == 0 || Math.abs(sb.charAt(sb.length() - 1) - ch) != 32) sb.append(ch);
            else sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
