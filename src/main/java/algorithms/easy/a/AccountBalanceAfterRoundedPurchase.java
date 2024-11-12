//https://leetcode.com/problems/account-balance-after-rounded-purchase/
package algorithms.easy.a;

public class AccountBalanceAfterRoundedPurchase {
    public static void main(String[] args) {
        AccountBalanceAfterRoundedPurchase purchase = new AccountBalanceAfterRoundedPurchase();
        System.out.println("Output:\t" + purchase.accountBalanceAfterPurchase(9));
        System.out.println("Output:\t" + purchase.accountBalanceAfterPurchase(15));
        System.out.println("Output:\t" + purchase.accountBalanceAfterPurchase(10));
    }

    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - (purchaseAmount + 5) / 10 * 10;
    }
}
