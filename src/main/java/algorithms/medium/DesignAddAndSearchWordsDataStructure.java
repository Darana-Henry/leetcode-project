//https://leetcode.com/problems/design-add-and-search-words-data-structure/
package algorithms.medium;

public class DesignAddAndSearchWordsDataStructure {
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println("Output:\t" + wordDictionary.search("pad")); // return False
        System.out.println("Output:\t" + wordDictionary.search("bad")); // return True
        System.out.println("Output:\t" + wordDictionary.search(".ad")); // return True
        System.out.println("Output:\t" + wordDictionary.search("b..")); // return True
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}

class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) current.children[index] = new TrieNode();
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        return searchInNode(word, root);
    }

    public boolean searchInNode(String word, TrieNode node) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '.') {
                for (TrieNode child : node.children) {
                    if (child != null && searchInNode(word.substring(i + 1), child)) return true;
                }
                return false;
            } else {
                int index = ch - 'a';
                if (node.children[index] == null) return false;
                node = node.children[index];
            }
        }
        return node.isEndOfWord;
    }
}