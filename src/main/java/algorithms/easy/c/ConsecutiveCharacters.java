//https://leetcode.com/problems/consecutive-characters/
package algorithms.easy.c;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        ConsecutiveCharacters consecutive = new ConsecutiveCharacters();
        System.out.println("Output:\t" + consecutive.maxPower("leetcode"));
        System.out.println("Output:\t" + consecutive.maxPower("abbcccddddeeeeedcba"));
    }

    public int maxPower(String s) {
        int max = 1, curr = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
                max = Math.max(max, curr);
            } else curr = 1;
        }
        return max;
    }
}
