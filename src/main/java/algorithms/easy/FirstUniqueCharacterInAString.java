//https://leetcode.com/problems/first-unique-character-in-a-string/
package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        FirstUniqueCharacterInAString unique = new FirstUniqueCharacterInAString();
        System.out.println("Output:\t" + unique.firstUniqCharViaMap("leetcode"));
        System.out.println("Output:\t" + unique.firstUniqCharOptimized("loveleetcode"));
        System.out.println("Output:\t" + unique.firstUniqCharOptimized("aabb"));
    }

    public int firstUniqCharViaMap(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (int i = 0; i < s.length(); i++)
            if (map.get(s.charAt(i)) == 1)
                return i;
        return -1;
    }

    public int firstUniqCharOptimized(String s) {
        int ans = Integer.MAX_VALUE;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && s.lastIndexOf(ch) == index)
                ans = Math.min(ans, index);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
