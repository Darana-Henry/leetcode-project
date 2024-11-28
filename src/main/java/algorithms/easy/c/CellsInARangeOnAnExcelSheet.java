//https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
package algorithms.easy.c;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public static void main(String[] args) {
        CellsInARangeOnAnExcelSheet excel = new CellsInARangeOnAnExcelSheet();
        System.out.println("Output:\t" + excel.cellsInRange("K1:L2"));
        System.out.println("Output:\t" + excel.cellsInRange("A1:F1"));
    }

    public List<String> cellsInRange(String s) {
        List<String> answer = new ArrayList<>();
        char sRow = s.charAt(1);
        char eRow = s.charAt(4);
        char sCol = s.charAt(0);
        char eCol = s.charAt(3);

        for (char col = sCol; col <= eCol; col++)
            for (char row = sRow; row <= eRow; row++)
                answer.add("" + col + row);

        return answer;
    }
}
