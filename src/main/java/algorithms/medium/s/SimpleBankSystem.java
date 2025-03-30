//https://leetcode.com/problems/simple-bank-system/
package algorithms.medium.s;

public class SimpleBankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank(new long[]{10, 100, 20, 50, 30});
        System.out.println("Output:\t" + bank.withdraw(3, 10));
        System.out.println("Output:\t" + bank.transfer(5, 1, 20));
        System.out.println("Output:\t" + bank.deposit(5, 20));
        System.out.println("Output:\t" + bank.transfer(3, 4, 15));
        System.out.println("Output:\t" + bank.withdraw(10, 50));
    }
}

class Bank {
    long[] balance;

    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 - 1 > balance.length || account2 - 1 > balance.length) return false;

        if (balance[account1 - 1] >= money) {
            balance[account1 - 1] -= money;
            balance[account2 - 1] += money;
            return true;
        } else return false;
    }

    public boolean deposit(int account, long money) {
        if (account - 1 > balance.length) return false;
        balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account - 1 > balance.length) return false;
        if (balance[account - 1] >= money) {
            balance[account - 1] -= money;
            return true;
        } else return false;
    }
}