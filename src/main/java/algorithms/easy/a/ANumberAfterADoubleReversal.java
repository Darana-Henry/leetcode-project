//https://leetcode.com/problems/a-number-after-a-double-reversal/
package algorithms.easy.a;

public class ANumberAfterADoubleReversal {
    public static void main(String[] args) {
        ANumberAfterADoubleReversal reversal = new ANumberAfterADoubleReversal();
        System.out.println("Output:\t" + reversal.isSameAfterReversals(526));
        System.out.println("Output:\t" + reversal.isSameAfterReversals(1800));
        System.out.println("Output:\t" + reversal.isSameAfterReversals(0));
    }

    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }
}
