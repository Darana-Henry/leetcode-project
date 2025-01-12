//https://leetcode.com/problems/word-subsets/
package algorithms.medium.w;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {
        WordSubsets obj = new WordSubsets();
        System.out.println(
                "Output:\t" + obj.wordSubsets(new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                        new String[]{"e", "o"}));
        System.out.println(
                "Output:\t" + obj.wordSubsets(new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                        new String[]{"l", "e"}));
    }

    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxSubsetFreq = new int[26];
        List<String> result = new ArrayList<>();

        for (String subsetWord : words2) {
            int[] tempFreq = new int[26];
            for (char ch : subsetWord.toCharArray()) {
                tempFreq[ch - 'a']++;
                maxSubsetFreq[ch - 'a'] = Math.max(maxSubsetFreq[ch - 'a'], tempFreq[ch - 'a']);
            }
        }

        for (String word : words1) {
            int[] wordFreq = new int[26];
            for (char ch : word.toCharArray()) {
                wordFreq[ch - 'a']++;
            }

            boolean isUniversal = true;
            for (int i = 0; i < 26; ++i) {
                if (maxSubsetFreq[i] > wordFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                result.add(word);
            }
        }
        return result;
    }
}
