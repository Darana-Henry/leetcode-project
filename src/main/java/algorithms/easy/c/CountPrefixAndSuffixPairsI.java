//https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/
package algorithms.easy.c;

public class CountPrefixAndSuffixPairsI {
    public static void main(String[] args) {
        CountPrefixAndSuffixPairsI prefixSuffix = new CountPrefixAndSuffixPairsI();
        System.out.println("Output:\t" + prefixSuffix.countPrefixSuffixPairs(new String[]{"a", "aba", "ababa", "aa"}));
        System.out.println("Output:\t" + prefixSuffix.countPrefixSuffixPairs(new String[]{"pa", "papa", "ma", "mama"}));
        System.out.println("Output:\t" + prefixSuffix.countPrefixSuffixPairs(new String[]{"abab", "ab"}));
    }

    public int countPrefixSuffixPairs(String[] words) {
        int answer = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) answer++;
            }
        }
        return answer;
    }
}
