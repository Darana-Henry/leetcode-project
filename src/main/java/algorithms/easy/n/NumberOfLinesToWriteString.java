//https://leetcode.com/problems/number-of-lines-to-write-string/
package algorithms.easy.n;

public class NumberOfLinesToWriteString {

    public static void main(String[] args) {
        NumberOfLinesToWriteString lines = new NumberOfLinesToWriteString();
        System.out.println("Output:\t" + lines.numberOfLines(
                new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                "abcdefghijklmnopqrstuvwxyz"));
        System.out.println("Output:\t" + lines.numberOfLines(
                new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                "bbbcccdddaaa"));
    }

    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0, lines = 1;

        for (char ch : s.toCharArray()) {
            int width = widths[ch - 'a'];
            if (sum + width <= 100) sum += width;
            else {
                lines++;
                sum = width;
            }
        }

        return new int[]{lines, sum};
    }
}
