//https://leetcode.com/problems/counting-words-with-a-given-prefix/
package algorithms.easy.c;

public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        CountingWordsWithAGivenPrefix prefix = new CountingWordsWithAGivenPrefix();
        System.out.println(
                "Output:\t" + prefix.prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at"));
        System.out.println(
                "Output:\t" + prefix.prefixCount(new String[]{"leetcode", "win", "loops", "success"}, "code"));
    }

    public int prefixCount(String[] words, String pref) {
        int answer = 0;
        for (String word : words) {
            if (word.startsWith(pref)) answer++;
        }
        return answer;
    }
}
