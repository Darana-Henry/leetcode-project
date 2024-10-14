//https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
package algorithms.easy.f;

public class FindTheKthCharacterInStringGameI {
    public static void main(String[] args) {
        FindTheKthCharacterInStringGameI k = new FindTheKthCharacterInStringGameI();
        System.out.println("Output:\t" + k.kthCharacter(5));
        System.out.println("Output:\t" + k.kthCharacter(10));
        System.out.println("Output:\t" + k.kthCharacterOptimized(5));
        System.out.println("Output:\t" + k.kthCharacterOptimized(10));
    }

    public char kthCharacterOptimized(int k) {
        return (char) ('a' + Integer.bitCount(k - 1));
    }

    public char kthCharacter(int k) {
        String s = "a";
        while (s.length() < k) {
            StringBuilder sb = new StringBuilder();
            for (char ch : s.toCharArray()) {
                if (ch == 'z') sb.append('a');
                else sb.append((char) (ch + 1));
            }
            s += sb.toString();
        }
        return s.charAt(k - 1);
    }
}
