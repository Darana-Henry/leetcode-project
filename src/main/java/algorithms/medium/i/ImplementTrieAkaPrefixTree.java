//https://leetcode.com/problems/implement-trie-prefix-tree/
package algorithms.medium.i;

public class ImplementTrieAkaPrefixTree {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println("Output:\t" + trie.search("apple"));   // return True
        System.out.println("Output:\t" + trie.search("app"));     // return False
        System.out.println("Output:\t" + trie.startsWith("app")); // return True
        trie.insert("app");
        System.out.println("Output:\t" + trie.search("app"));     // return True
    }
}

class Trie {
    private Trie[] children;
    private boolean isEndOfWord;

    public Trie() {
        children = new Trie[26];
        isEndOfWord = false;
    }

    public void insert(String word) {
        Trie current = this;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) current.children[index] = new Trie();
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        Trie node = searchWord(word);
        return node != null && node.isEndOfWord;

    }

    public boolean startsWith(String prefix) {
        Trie node = searchWord(prefix);
        return node != null;
    }

    public Trie searchWord(String word) {
        Trie current = this;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) return null;
            current = current.children[index];
        }
        return current;
    }
}
