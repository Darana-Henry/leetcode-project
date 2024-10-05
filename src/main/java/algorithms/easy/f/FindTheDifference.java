//https://leetcode.com/problems/find-the-difference/description/
package algorithms.easy.f;

import java.util.HashMap;

public class FindTheDifference {
    public static void main(String[] args) {
        FindTheDifference diff = new FindTheDifference();
        System.out.println("Output:\t" + diff.findTheDifferenceViaXOR("abcd", "abcde"));
        System.out.println("Output:\t" + diff.findTheDifferenceViaHashMap("", "y"));
    }

    public char findTheDifferenceViaHashMap(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch) || (map.get(ch) == 0))
                return ch;
            else if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, --count);
            }
        }
        return ' ';
    }

    public char findTheDifferenceViaXOR(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray())
            c ^= cs;
        for(char ct : t.toCharArray())
            c ^= ct;
        return c;
    }
}
