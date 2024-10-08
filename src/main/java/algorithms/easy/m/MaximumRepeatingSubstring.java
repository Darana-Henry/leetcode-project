//https://leetcode.com/problems/maximum-repeating-substring/
package algorithms.easy.m;


public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        MaximumRepeatingSubstring repeat = new MaximumRepeatingSubstring();
        System.out.println("Output:\t" + repeat.maxRepeating("ababc", "ab"));
        System.out.println("Output:\t" + repeat.maxRepeating("ababc", "ba"));
        System.out.println("Output:\t" + repeat.maxRepeating("ababc", "ac"));
    }

    public int maxRepeating(String sequence, String word) {
        String find = "";
        while (sequence.contains(find)) find += word;
        return (find.length() - word.length()) / word.length();
    }
}
