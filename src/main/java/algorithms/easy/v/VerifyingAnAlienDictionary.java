//https://leetcode.com/problems/verifying-an-alien-dictionary/
package algorithms.easy.v;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAnAlienDictionary {
    public static void main(String[] args) {
        VerifyingAnAlienDictionary alien = new VerifyingAnAlienDictionary();
        System.out.println(
                "Output:\t" + alien.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        System.out.println(
                "Output:\t" + alien.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
        System.out.println(
                "Output:\t" + alien.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
    }

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < order.length(); i++)
            map.put(order.charAt(i), i);

        for (int i = 1; i < words.length; i++) {
            String first = words[i - 1];
            String second = words[i];

            for (int j = 0; j < first.length(); j++) {
                if (j == second.length()) return false;
                char fchar = first.charAt(j);
                char schar = second.charAt(j);
                if (map.get(fchar) < map.get(schar)) break;
                if (map.get(fchar) > map.get(schar)) return false;
            }
        }
        return true;
    }
}
