package algorithms.easy;//https://leetcode.com/problems/pascals-triangle-ii/description/

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

    public static void main(String[] args) {

        PascalTriangleII triangleII = new PascalTriangleII();

        int rowIndex = 3;
        System.out.println("Output:\t" + triangleII.getRow(rowIndex));

        rowIndex = 0;
        System.out.println("Output:\t" + triangleII.getRow(rowIndex));

        rowIndex = 1;
        System.out.println("Output:\t" + triangleII.getRow(rowIndex));
    }

    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        long previous = 1;
        row.add((int) previous);

        for (int i = 1; i <= rowIndex; i++) {
            long current = (previous * (rowIndex - i + 1)) / i;
            row.add((int) current);
            previous = current;
        }
        return row;
    }
}
