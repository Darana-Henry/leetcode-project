//https://leetcode.com/problems/flipping-an-image/
package algorithms.easy.f;

public class FlippingAnImage {
    public static void main(String[] args) {
        FlippingAnImage flip = new FlippingAnImage();
        System.out.println("Output:\t" + flip.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}));
        System.out.println("Output:\t" + flip.flipAndInvertImage(
                new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}}));
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] flip : image) {
            int start = 0;
            int end = flip.length - 1;
            while (start < end) {
                int temp = flip[start];
                flip[start] = flip[end];
                flip[end] = temp;
                start++;
                end--;
            }
        }

        for (int[] invert : image) {
            for (int i = 0; i < invert.length; i++) {
                if (invert[i] == 0) invert[i] = 1;
                else invert[i] = 0;
            }
        }

        return image;
    }
}
