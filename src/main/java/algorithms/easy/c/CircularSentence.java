//https://leetcode.com/problems/circular-sentence/
package algorithms.easy.c;

public class CircularSentence {
    public static void main(String[] args) {
        CircularSentence ciruclar = new CircularSentence();
        System.out.println("Output:\t" + ciruclar.isCircularSentence("leetcode exercises sound delightful"));
        System.out.println("Output:\t" + ciruclar.isCircularSentence("eetcode"));
        System.out.println("Output:\t" + ciruclar.isCircularSentence("Leetcode is cool"));
    }

    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        if (sentence.charAt(0) != sentence.charAt(n - 1)) return false;
        for (int i = 1; i < n; i++)
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) return false;
        return true;
    }
}
