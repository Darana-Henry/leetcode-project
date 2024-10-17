//https://leetcode.com/problems/rectangle-overlap/
package algorithms.easy.r;

public class RectangleOverlap {
    public static void main(String[] args) {
        RectangleOverlap overlap = new RectangleOverlap();
        System.out.println("Output:\t" + overlap.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
        System.out.println("Output:\t" + overlap.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}));
        System.out.println("Output:\t" + overlap.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{2, 2, 3, 3}));
    }

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int r1blx = rec1[0], r1bly = rec1[1], r1trx = rec1[2], r1try = rec1[3];
        int r2blx = rec2[0], r2bly = rec2[1], r2trx = rec2[2], r2try = rec2[3];
        return !(r2bly >= r1try || r2try <= r1bly || r2blx >= r1trx || r2trx <= r1blx);
    }
}
