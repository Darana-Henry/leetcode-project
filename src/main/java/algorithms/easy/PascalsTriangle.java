package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {

        PascalsTriangle triangle = new PascalsTriangle();

        int numRows = 5;
        System.out.println("Output:\t" + triangle.generate(numRows));

        numRows = 1;
        System.out.println("Output:\t" + triangle.generate(numRows));
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0)
            return triangle;

        List<Integer> topRow = new ArrayList<>();
        topRow.add(1);
        triangle.add(topRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }
}
