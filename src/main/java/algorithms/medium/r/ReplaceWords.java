//https://leetcode.com/problems/replace-words/description/
package algorithms.medium.r;

import context.Trie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {
    Trie root;

    public static void main(String[] args) {

        ReplaceWords replaceWords = new ReplaceWords();
        System.out.println("Output:\t" + replaceWords.replaceWordsMyMethod(Arrays.asList("cat", "bat", "rat"),
                "the cattle was rattled by the battery"));
        System.out.println("Output:\t" + replaceWords.replaceWordsMyMethod(Arrays.asList("a", "b", "c"),
                "aadsfasf absbs bbab cadsfafs"));
    }

    public String replaceWordsMyMethod(List<String> dictionary, String sentence) {
        Set<String> dict = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            boolean foundRoot = false;

            for (int j = 0; j < words[i].length(); j++) {
                if (dict.contains(words[i].substring(0, j))) {
                    result.append(words[i].substring(0, j)).append(" ");
                    foundRoot = true;
                    break;
                }
            }

            if (!foundRoot) result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }

    public String replaceWordsWithTrie(List<String> dictionary, String sentence) {
        root = new Trie();
        for (String word : dictionary)
            insert(word);

        StringBuilder result = new StringBuilder();
        String[] input = sentence.split(" ");
        for (String word : input) {
            result.append(search(word)).append(" ");
        }
        return result.toString().trim();
    }

    public String search(String word) {
        Trie node = root;
        int j = 0;

        for (char c : word.toCharArray()) {
            int i = c - 'a';
            j++;

            if (node.children[i] == null)
                return word;
            else if (node.children[i].isEnd)
                return word.substring(0, j);
            else
                node = node.children[i];
        }
        return word;
    }

    public void insert(String word) {
        Trie node = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.children[i] == null)
                node.children[i] = new Trie();
            node = node.children[i];
        }
        node.isEnd = true;
    }
}
