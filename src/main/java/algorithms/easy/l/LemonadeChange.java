//https://leetcode.com/problems/lemonade-change/
package algorithms.easy.l;

public class LemonadeChange {
    public static void main(String[] args) {
        LemonadeChange lemonade = new LemonadeChange();
        System.out.println("Output:\t" + lemonade.lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        System.out.println("Output:\t" + lemonade.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }

    public boolean lemonadeChange(int[] bills) {
        int dollar5 = 0, dollar10 = 0;
        for (int bill : bills) {
            switch (bill) {
                case 5:
                    dollar5++;
                    break;
                case 10:
                    dollar5--;
                    dollar10++;
                    break;
                case 20:
                    if (dollar10 > 0) {
                        dollar10--;
                        dollar5--;
                    } else dollar5 -= 3;
                    break;
            }
            if (dollar5 < 0) return false;
        }

        return true;
    }
}
