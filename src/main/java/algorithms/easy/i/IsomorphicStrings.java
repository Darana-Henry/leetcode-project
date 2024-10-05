//https://leetcode.com/problems/isomorphic-strings/description/
package algorithms.easy.i;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {

        IsomorphicStrings isomorphic = new IsomorphicStrings();

        String s = "egg", t = "add";
        System.out.println("Output:\t" + isomorphic.isIsomorphic(s, t));

        s = "foo";
        t = "bar";
        System.out.println("Output:\t" + isomorphic.isIsomorphic(s, t));

        s = "paper";
        t = "title";
        System.out.println("Output:\t" + isomorphic.isIsomorphic(s, t));

        s = "badc";
        t = "baba";
        System.out.println("Output:\t" + isomorphic.isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> isomorphic = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (isomorphic.containsKey(s.charAt(i))) {
                if (isomorphic.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {
                if (isomorphic.containsValue(t.charAt(i)))
                    return false;
                else
                    isomorphic.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
