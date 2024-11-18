//https://leetcode.com/problems/shortest-completing-word/
package algorithms.easy.s;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        ShortestCompletingWord shortest = new ShortestCompletingWord();
        System.out.println("Output:\t" + shortest.shortestCompletingWord("1s3 PSt",
                new String[]{"step", "steps", "stripe", "stepple"}));
        System.out.println("Output:\t" + shortest.shortestCompletingWord("1s3 456",
                new String[]{"looks", "pest", "stew", "show"}));
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] lCount = count(licensePlate.toLowerCase());
        String answer = null;
        int minLen = 16;

        for (String word : words) {
            if (word.length() >= minLen) continue;

            int[] wCount = count(word.toLowerCase());
            if (haveSameChars(lCount, wCount)) {
                minLen = word.length();
                answer = word;
            }

        }

        return answer;
    }

    public int[] count(String word) {
        int[] answer = new int[26];

        for (char ch : word.toCharArray())
            if (Character.isLetter(ch)) answer[ch - 'a']++;

        return answer;
    }

    public boolean haveSameChars(int[] source, int[] target) {
        for (int i = 0; i < 26; i++)
            if (source[i] > target[i]) return false;

        return true;
    }
}
