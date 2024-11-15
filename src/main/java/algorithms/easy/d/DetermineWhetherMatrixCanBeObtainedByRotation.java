//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
package algorithms.easy.d;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        DetermineWhetherMatrixCanBeObtainedByRotation rotation = new DetermineWhetherMatrixCanBeObtainedByRotation();
        System.out.println(
                "Output:\t" + rotation.findRotation(new int[][]{{0, 1}, {1, 0}}, new int[][]{{1, 0}, {0, 1}}));
        System.out.println(
                "Output:\t" + rotation.findRotation(new int[][]{{0, 1}, {1, 1}}, new int[][]{{1, 0}, {0, 1}}));
        System.out.println("Output:\t" + rotation.findRotation(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}},
                new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 0}}));
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int k = 0; k < 4; k++) {
            int[][] rotated = new int[n][n];

            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++)
                    rotated[row][col] = mat[col][n - row - 1];
            }

            if (isEqual(rotated, target)) return true;

            mat = rotated;
        }

        return false;
    }

    public boolean isEqual(int[][] curr, int[][] target) {
        int n = curr.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++)
                if (curr[row][col] != target[row][col]) return false;
        }

        return true;
    }
}
