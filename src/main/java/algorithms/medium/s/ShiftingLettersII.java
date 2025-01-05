//https://leetcode.com/problems/shifting-letters-ii/
package algorithms.medium.s;

public class ShiftingLettersII {
    public static void main(String[] args) {
        ShiftingLettersII obj = new ShiftingLettersII();
        System.out.println("Output:\t" + obj.shiftingLetters("abc", new int[][]{{0, 1, 0}, {1, 2, 1}, {0, 2, 1}}));
        System.out.println("Output:\t" + obj.shiftingLetters("dztz", new int[][]{{0, 0, 0}, {1, 1, 1}}));
    }

    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] count = new int[n + 1];
        StringBuilder sb = new StringBuilder();

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];
            dir = dir == 1 ? 1 : -1;

            count[start] += dir;
            count[end + 1] -= dir;
        }

        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        for (int i = 0; i < n; i++) {
            int shift = (s.charAt(i) - 'a' + count[i] % 26 + 26) % 26;
            sb.append((char) ('a' + shift));
        }

        return sb.toString();

    }
}
