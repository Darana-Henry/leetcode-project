//https://leetcode.com/problems/palindrome-partitioning/
package algorithms.medium.p;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    List<List<String>> palindromes = new ArrayList<>();
    String str;

    public static void main(String[] args) {
        PalindromePartitioning partitions = new PalindromePartitioning();
        System.out.println("Output:\t" + partitions.partition("aab"));
        System.out.println("Output:\t" + partitions.partition("a"));
    }

    public List<List<String>> partition(String s) {
        this.str = s;
        backtrack(0, new ArrayList<>());
        return palindromes;
    }

    public void backtrack(int index, List<String> curr) {
        if (str.length() == index) {
            palindromes.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < str.length(); i++) {
            if (isPalindrome(index, i)) {
                curr.add(str.substring(index, i + 1));
                backtrack(i + 1, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }

    public boolean isPalindrome(int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
