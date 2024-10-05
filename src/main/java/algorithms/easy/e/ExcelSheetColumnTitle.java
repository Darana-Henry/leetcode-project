package algorithms.easy.e; //https://leetcode.com/problems/excel-sheet-column-title/description/

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        ExcelSheetColumnTitle columnTitle = new ExcelSheetColumnTitle();
        System.out.println("Output:\t" + columnTitle.convertToTitle(1));
        System.out.println("Output:\t" + columnTitle.convertToTitle(27));
    }

    public String convertToTitle(int columnNumber) {
        String str = "";

        while (columnNumber > 0) {
            columnNumber--;
            str = (char) (columnNumber % 26 + 'A') + str;
            columnNumber = columnNumber / 26;
        }
        return str;
    }

    public String convertToTitleFaster(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber != 0) {
            --columnNumber;
            res.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }
}
