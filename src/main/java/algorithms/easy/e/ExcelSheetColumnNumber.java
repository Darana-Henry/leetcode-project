//https://leetcode.com/problems/excel-sheet-column-number/description/
package algorithms.easy.e;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        ExcelSheetColumnNumber columnNumber = new ExcelSheetColumnNumber();
        System.out.println("Output:\t" + columnNumber.titleToNumber("AB"));
        System.out.println("Output:\t" + columnNumber.titleToNumber("ZY"));
        System.out.println("Output:\t" + columnNumber.titleToNumber("ABC"));
    }

    public int titleToNumber(String columnTitle) {

        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            int digit = c - 'A' + 1;
            result = result * 26 + digit;
        }
        return result;
    }
}