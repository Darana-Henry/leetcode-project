//https://leetcode.com/problems/distribute-money-to-maximum-children/
package algorithms.easy.d;

public class DistributeMoneyToMaximumChildren {
    public static void main(String[] args) {
        DistributeMoneyToMaximumChildren distribute = new DistributeMoneyToMaximumChildren();
        System.out.println("Output:\t" + distribute.distMoney(20, 3));
        System.out.println("Output:\t" + distribute.distMoney(16, 2));
    }

    public int distMoney(int money, int children) {
        if (money < children) return -1;
        if (money > 8 * children) return children - 1;
        if (money == 8 * children - 4) return children - 2;
        return (money - children) / 7;
    }
}
