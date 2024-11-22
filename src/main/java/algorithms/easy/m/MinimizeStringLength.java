//https://leetcode.com/problems/minimize-string-length/
package algorithms.easy.m;

import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength {
    public static void main(String[] args) {
        MinimizeStringLength minimize = new MinimizeStringLength();
        System.out.println("Output:\t" + minimize.minimizedStringLength("aaabc"));
        System.out.println("Output:\t" + minimize.minimizedStringLength("cbbd"));
        System.out.println("Output:\t" + minimize.minimizedStringLength("baadccab"));
    }

    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray())
            set.add(ch);
        return set.size();
    }
}
