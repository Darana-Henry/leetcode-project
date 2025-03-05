//https://leetcode.com/problems/count-total-number-of-colored-cells/
package algorithms.medium.c;

public class CountTotalNumberOfColoredCells {
    public static void main(String[] args) {
        CountTotalNumberOfColoredCells obj = new CountTotalNumberOfColoredCells();
        System.out.println("Output:\t" + obj.coloredCells(1));
        System.out.println("Output:\t" + obj.coloredCells(2));
    }

    public long coloredCells(int n) {
        return 1 + (long) n * (n - 1) * 2;
    }
}
