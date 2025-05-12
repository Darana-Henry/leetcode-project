//https://leetcode.com/problems/bulb-switcher/
package algorithms.medium.b;

public class BulbSwitcher {
    public static void main(String[] args) {
        BulbSwitcher obj = new BulbSwitcher();
        System.out.println("Output:\t" + obj.bulbSwitch(3));
        System.out.println("Output:\t" + obj.bulbSwitch(0));
        System.out.println("Output:\t" + obj.bulbSwitch(1));
    }

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
