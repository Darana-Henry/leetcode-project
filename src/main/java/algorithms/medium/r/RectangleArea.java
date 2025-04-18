//https://leetcode.com/problems/rectangle-area/
package algorithms.medium.r;

public class RectangleArea {
    public static void main(String[] args) {
        RectangleArea obj = new RectangleArea();
        System.out.println("Output:\t" + obj.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        System.out.println("Output:\t" + obj.computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
    }

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        int x = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int y = Math.min(ay2, by2) - Math.max(ay1, by1);
        x = Math.max(x, 0);
        y = Math.max(y, 0);
        return area1 + area2 - (x * y);
    }
}
