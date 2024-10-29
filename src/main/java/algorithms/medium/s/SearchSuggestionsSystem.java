//https://leetcode.com/problems/search-suggestions-system/
package algorithms.medium.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {
    public static void main(String[] args) {
        SearchSuggestionsSystem suggestions = new SearchSuggestionsSystem();
        System.out.println("Output:\t" + suggestions.suggestedProducts(
                new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse"));
        System.out.println("Output:\t" + suggestions.suggestedProducts(new String[]{"havana"}, "havana"));
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> suggestions = new ArrayList<>();
        Arrays.sort(products);
        Tried trie = new Tried();

        for (int i = 0; i < products.length; ++i)
            trie.insert(products[i], i);


        for (List<Integer> indices : trie.search(searchWord)) {
            List<String> productList = new ArrayList<>();
            for (int index : indices) productList.add(products[index]);
            suggestions.add(productList);
        }
        return suggestions;
    }
}


class Tried {
    Tried[] children = new Tried[26];
    List<Integer> indices = new ArrayList<>();

    public void insert(String word, int index) {
        Tried node = this;
        for (char ch : word.toCharArray()) {
            int charIdx = ch - 'a';
            if (node.children[charIdx] == null) node.children[charIdx] = new Tried();
            node = node.children[charIdx];
            if (node.indices.size() < 3) node.indices.add(index);
        }
    }

    public List<Integer>[] search(String word) {
        Tried node = this;
        int wordLength = word.length();
        List<Integer>[] searchResults = new List[wordLength];
        Arrays.setAll(searchResults, k -> new ArrayList<>());

        for (int i = 0; i < wordLength; ++i) {
            int charIdx = word.charAt(i) - 'a';
            if (node.children[charIdx] == null) break;
            node = node.children[charIdx];
            searchResults[i] = node.indices;
        }
        return searchResults;
    }
}