//https://leetcode.com/problems/shortest-distance-to-a-character/
package algorithms.easy.s;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) {
        ShortestDistanceToACharacter shortDistance = new ShortestDistanceToACharacter();
        System.out.println("Output:\t" + shortDistance.shortestToChar("loveleetcode", 'e'));
        System.out.println("Output:\t" + shortDistance.shortestToChar("aaab", 'b'));
    }

    public int[] shortestToChar(String s, char c) {
        int[] distance = new int[s.length()];
        int closest = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) closest = i;
            distance[i] = Math.abs(closest - i);
        }

        closest = Integer.MAX_VALUE;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) closest = i;
            distance[i] = Math.min(Math.abs(closest - i), distance[i]);
        }

        return distance;
    }
}
