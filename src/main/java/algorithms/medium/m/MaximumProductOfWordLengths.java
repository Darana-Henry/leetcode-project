//https://leetcode.com/problems/maximum-product-of-word-lengths/
package algorithms.medium.m;

public class MaximumProductOfWordLengths {
    public static void main(String[] args) {
        MaximumProductOfWordLengths obj = new MaximumProductOfWordLengths();
        System.out.println("Output:\t" + obj.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
        System.out.println("Output:\t" + obj.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
        System.out.println("Output:\t" + obj.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
    }

    public int maxProduct(String[] words) {
        int answer = 0, n = words.length;
        int[] bm = new int[n];

        for (int i = 0; i < n; i++)
            for (char c : words[i].toCharArray())
                bm[i] |= (1 << (c - 'a'));

        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if ((bm[i] & bm[j]) == 0) answer = Math.max(answer, words[i].length() * words[j].length());

        return answer;
    }
}
