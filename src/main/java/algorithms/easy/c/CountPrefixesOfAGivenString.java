//https://leetcode.com/problems/count-prefixes-of-a-given-string/
package algorithms.easy.c;

public class CountPrefixesOfAGivenString {
    public static void main(String[] args) {
        CountPrefixesOfAGivenString prefixes = new CountPrefixesOfAGivenString();
        System.out.println("Output:\t" + prefixes.countPrefixes(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc"));
        System.out.println("Output:\t" + prefixes.countPrefixes(new String[]{"a", "a"}, "aa"));

    }

    public int countPrefixes(String[] words, String s) {
        int answer = 0;
        for (String word : words)
            if (s.startsWith(word)) answer++;
        return answer;
    }
}
