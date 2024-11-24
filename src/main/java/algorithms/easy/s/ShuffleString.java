//https://leetcode.com/problems/shuffle-string/
package algorithms.easy.s;

public class ShuffleString {
    public static void main(String[] args) {
        ShuffleString shuffle = new ShuffleString();
        System.out.println("Output:\t" + shuffle.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        System.out.println("Output:\t" + shuffle.restoreString("abc", new int[]{0, 1, 2}));
    }

    public String restoreString(String s, int[] indices) {
        char[] word = new char[indices.length];

        int i = 0;
        for (int index : indices)
            word[index] = s.charAt(i++);

        return new String(word);
    }
}
