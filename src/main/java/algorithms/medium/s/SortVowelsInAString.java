//https://leetcode.com/problems/sort-vowels-in-a-string/
package algorithms.medium.s;

import java.util.PriorityQueue;

public class SortVowelsInAString {
    public static void main(String[] args) {
        SortVowelsInAString obj = new SortVowelsInAString();
        System.out.println("Output:\t" + obj.sortVowels("lEetcOde"));
        System.out.println("Output:\t" + obj.sortVowels("lYmpH"));
        System.out.println("Output:\t" + obj.sortVowelsOptimized("lEetcOde"));
        System.out.println("Output:\t" + obj.sortVowelsOptimized("lYmpH"));
    }


    public String sortVowels(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray())
            if (isVowel(ch)) pq.offer(ch);

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) sb.append(pq.poll());
            else sb.append(ch);
        }

        return sb.toString();
    }

    boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i' || c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'I';
    }

    public String sortVowelsOptimized(String s) {
        int[] count = new int[1000];
        String sorted = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray())
            if (isVowel(ch)) count[ch - 'A']++;

        for (int i = 0, j = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isVowel(ch)) sb.append(ch);
            else {
                while (count[sorted.charAt(j) - 'A'] == 0) j++;
                sb.append(sorted.charAt(j));
                count[sorted.charAt(j) - 'A']--;
            }
        }

        return sb.toString();
    }
}
