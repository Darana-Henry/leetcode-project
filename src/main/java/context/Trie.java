package context;

public class Trie {
    public Trie[] children;
    public boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }
}
