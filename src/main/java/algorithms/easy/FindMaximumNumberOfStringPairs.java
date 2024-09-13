//https://leetcode.com/problems/find-maximum-number-of-string-pairs/
package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        FindMaximumNumberOfStringPairs pairs = new FindMaximumNumberOfStringPairs();
        System.out.println("Output:\t" + pairs.maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"}));
        System.out.println("Output:\t" + pairs.maximumNumberOfStringPairs(new String[]{"ab", "ba", "cc"}));
        System.out.println("Output:\t" + pairs.maximumNumberOfStringPairs(new String[]{"aa", "ab"}));
    }

    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int pairs = 0;
        for (String word : words) {
            if (set.size() != 0) {
                String reversed = new StringBuilder(word).reverse().toString();
                if (set.contains(reversed)) pairs++;
                else set.add(word);
            } else set.add(word);
        }
        return pairs;
    }
}
