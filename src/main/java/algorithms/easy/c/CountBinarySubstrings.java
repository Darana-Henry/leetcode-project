//https://leetcode.com/problems/count-binary-substrings/
package algorithms.easy.c;

import java.util.ArrayList;
import java.util.List;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        CountBinarySubstrings count = new CountBinarySubstrings();
        System.out.println("Output:\t" + count.countBinarySubstrings("00110011"));
        System.out.println("Output:\t" + count.countBinarySubstrings("10101"));
    }

    public int countBinarySubstrings(String s) {
        int substrings = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            list.add(count);
        }

        for (int i = 1; i < list.size(); i++)
            substrings += Math.min(list.get(i), list.get(i - 1));

        return substrings;
    }
}
