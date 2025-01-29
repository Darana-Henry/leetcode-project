//https://leetcode.com/problems/subrectangle-queries/
package algorithms.medium.s;


public class SubRectangleQueries {
    public static void main(String[] args) {
        Queries abj = new Queries(new int[][]{{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}});
        System.out.println("Output:\t" + abj.getValue(0, 2)); // return 1
        abj.updateSubrectangle(0, 0, 3, 2, 5);
        System.out.println("Output:\t" + abj.getValue(0, 2)); // return 5
        System.out.println("Output:\t" + abj.getValue(3, 1)); // return 5
        abj.updateSubrectangle(3, 0, 3, 2, 10);
        System.out.println("Output:\t" + abj.getValue(3, 1)); // return 10
        System.out.println("Output:\t" + abj.getValue(0, 2)); // return 5


        Queries bbj = new Queries(new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}});
        System.out.println("Output:\t" + bbj.getValue(0, 0)); // return 1
        bbj.updateSubrectangle(0, 0, 2, 2, 100);
        System.out.println("Output:\t" + bbj.getValue(0, 0)); // return 100
        System.out.println("Output:\t" + bbj.getValue(2, 2)); // return 100
        bbj.updateSubrectangle(1, 1, 2, 2, 20);
        System.out.println("Output:\t" + bbj.getValue(2, 2)); // return 20
    }
}

class Queries {
    int[][] rectangle;

    public Queries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int row = row1; row <= row2; row++)
            for (int col = col1; col <= col2; col++)
                rectangle[row][col] = newValue;
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}