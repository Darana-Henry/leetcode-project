//https://leetcode.com/problems/word-search-ii/
package algorithms.hard.w;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {
    char[][] board;
    String[] words;
    int rows = 0;
    int cols = 0;
    List<String> answer = new ArrayList<>();

    public static void main(String[] args) {
        WordSearchII search = new WordSearchII();
        System.out.println("Output:\t" + search.findWords(new char[][]{{'a', 'b'}, {'c', 'd'}}, new String[]{"abcb"}));
        System.out.println("Output:\t" + search.findWords(
                new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}},
                new String[]{"oath", "pea", "eat", "rain"}));
    }

    public List<String> findWords(char[][] board, String[] words) {
        this.board = board;
        this.words = words;
        Trie trie = new Trie();

        for (int i = 0; i < words.length; i++)
            trie.insert(words[i], i);

        rows = board.length;
        cols = board[0].length;

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                dfs(trie, row, col);

        return answer;

    }

    public void dfs(Trie node, int row, int col) {
        int index = board[row][col] - 'a';

        if (node.children[index] == null) return;

        node = node.children[index];
        if (node.reference != -1) {
            answer.add(words[node.reference]);
            node.reference = -1;
        }

        char temp = board[row][col];
        board[row][col] = '#';
        int[] direction = {-1, 0, 1, 0, -1};
        for (int k = 0; k < 4; k++) {
            int nextR = row + direction[k];
            int nextC = col + direction[k + 1];
            if (nextR >= 0 && nextR < rows && nextC >= 0 && nextC < cols && board[nextR][nextC] != '#') {
                dfs(node, nextR, nextC);
            }
        }
        board[row][col] = temp;
    }

    class Trie {
        Trie[] children = new Trie[26];
        int reference = -1;

        public void insert(String word, int reference) {
            Trie node = this;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (node.children[index] == null) node.children[index] = new Trie();
                node = node.children[index];
            }
            node.reference = reference;
        }
    }
}
