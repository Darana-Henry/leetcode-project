//https://leetcode.com/problems/calculate-money-in-leetcode-bank/
package algorithms.easy.c;

public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        CalculateMoneyInLeetcodeBank bank = new CalculateMoneyInLeetcodeBank();
        System.out.println("Output:\t" + bank.totalMoney(4));
        System.out.println("Output:\t" + bank.totalMoney(10));
        System.out.println("Output:\t" + bank.totalMoney(20));
    }

    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        int weekSavings = (28 + (28 + 7 * (weeks - 1))) * weeks / 2;
        int daySavings = ((weeks * 2) + days + 1) * days / 2;
        return weekSavings + daySavings;
    }
}
