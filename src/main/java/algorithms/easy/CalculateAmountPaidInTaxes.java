//https://leetcode.com/problems/calculate-amount-paid-in-taxes/
package algorithms.easy;

public class CalculateAmountPaidInTaxes {
    public static void main(String[] args) {
        CalculateAmountPaidInTaxes taxes = new CalculateAmountPaidInTaxes();
        System.out.println("Output:\t" + taxes.calculateTax(new int[][]{{3, 50}, {7, 10}, {12, 25}}, 10));
        System.out.println("Output:\t" + taxes.calculateTax(new int[][]{{1, 0}, {4, 25}, {5, 50}}, 2));
        System.out.println("Output:\t" + taxes.calculateTax(new int[][]{{2, 50}}, 0));
    }

    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        double taxedIncome = 0;
        for (int[] bracket : brackets) {
            double upper = bracket[0];
            double percent = bracket[1];
            if (income > upper) {
                tax += (upper - taxedIncome) * percent;
                taxedIncome = upper;
            } else {
                tax += (income - taxedIncome) * percent;
                break;
            }
        }
        return tax / 100;

    }
}
