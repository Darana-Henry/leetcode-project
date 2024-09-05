//https://leetcode.com/problems/image-smoother/
package algorithms.easy;


public class ImageSmoother {
    public static void main(String[] args) {
        ImageSmoother smoother = new ImageSmoother();
        System.out.println("Output:\t" + smoother.imageSmoother(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}));
        System.out.println(
                "Output:\t" + smoother.imageSmoother(new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}}));
    }

    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] smooth = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int sum = 0;
                int count = 0;

                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (i >= 0 && j >= 0 && i < rows && j < cols) {
                            sum += img[i][j];
                            count++;
                        }
                    }
                }
                smooth[row][col] = sum / count;
            }
        }
        return smooth;
    }
}
