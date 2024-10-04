//https://leetcode.com/problems/find-the-pivot-integer/
package algorithms.easy;

public class FindThePivotInteger {
    public static void main(String[] args) {
        FindThePivotInteger pivot = new FindThePivotInteger();
        System.out.println("Output:\t" + pivot.pivotInteger(8));
        System.out.println("Output:\t" + pivot.pivotInteger(1));
        System.out.println("Output:\t" + pivot.pivotInteger(4));
    }
    public int pivotInteger(int n) {
        int sum = ((n * (n + 1)) / 2);
        int sqrt = (int) Math.sqrt(sum);
        if (sqrt * sqrt == sum) return sqrt;
        else return -1;
    }
}
