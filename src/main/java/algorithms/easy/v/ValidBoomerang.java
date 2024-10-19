//https://leetcode.com/problems/valid-boomerang/
package algorithms.easy.v;

public class ValidBoomerang {
    public static void main(String[] args) {
        ValidBoomerang boomerang = new ValidBoomerang();
        System.out.println("Output:\t" + boomerang.isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}}));
        System.out.println("Output:\t" + boomerang.isBoomerang(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }

    public boolean isBoomerang(int[][] points) {
        return (points[1][1] - points[0][1]) * (points[2][0] - points[1][0]) != (points[2][1] - points[1][1]) * (points[1][0] - points[0][0]);
    }
}
