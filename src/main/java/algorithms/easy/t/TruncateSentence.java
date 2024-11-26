//https://leetcode.com/problems/truncate-sentence/
package algorithms.easy.t;

public class TruncateSentence {
    public static void main(String[] args) {
        TruncateSentence truncate = new TruncateSentence();
        System.out.println("Output:\t" + truncate.truncateSentence("Hello how are you Contestant", 4));
        System.out.println("Output:\t" + truncate.truncateSentence("What is the solution to this problem", 4));
        System.out.println("Output:\t" + truncate.truncateSentence("chopper is not a tanuki", 5));
        System.out.println("Output:\t" + truncate.truncateSentenceOptimized("Hello how are you Contestant", 4));
        System.out.println("Output:\t" + truncate.truncateSentenceOptimized("What is the solution to this problem", 4));
        System.out.println("Output:\t" + truncate.truncateSentenceOptimized("chopper is not a tanuki", 5));
    }

    public String truncateSentenceOptimized(String s, int k) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ') if (--k == 0) return s.substring(0, i);

        return s;
    }

    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++)
            sb.append(words[i]).append(" ");

        return sb.toString().trim();
    }
}
