//https://leetcode.com/problems/string-compression/description/
package algorithms.medium.s;

public class StringCompression {

    public static void main(String[] args) {

        StringCompression compression = new StringCompression();
        System.out.println("Output:\t" + compression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println("Output:\t" + compression.compress(new char[]{'a'}));
        System.out.println("Output:\t" + compression.compress(
                new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }

    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            int j = i;

            while ((j < chars.length) && chars[j] == chars[i]) {
                j++;
            }

            chars[index++] = chars[i];
            if (j - i > 1) {
                String count = j - i + "";

                for (char c : count.toCharArray())
                    chars[index++] = c;
            }
            i = j;
        }
        return index;
    }
}
