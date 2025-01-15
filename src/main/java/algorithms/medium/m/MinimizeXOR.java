//https://leetcode.com/problems/minimize-xor/
package algorithms.medium.m;

public class MinimizeXOR {
    public static void main(String[] args) {
        MinimizeXOR obj = new MinimizeXOR();
        System.out.println("Output:\t" + obj.minimizeXor(3, 5));
        System.out.println("Output:\t" + obj.minimizeXor(1, 12));
        System.out.println("Output:\t" + obj.minimizeXorLoops(3, 5));
        System.out.println("Output:\t" + obj.minimizeXorLoops(1, 12));
    }

    public int minimizeXor(int num1, int num2) {
        int count1 = Integer.bitCount(num1);
        int count2 = Integer.bitCount(num2);

        while (count1 > count2) {
            num1 &= (num1 - 1);
            --count1;
        }

        while (count1 < count2) {
            num1 |= (num1 + 1);
            ++count1;
        }

        return num1;
    }

    public int minimizeXorLoops(int num1, int num2) {
        int count = Integer.bitCount(num2), result = 0;

        for (int i = 31; i >= 0 && count > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                result |= (1 << i);
                count--;
            }
        }

        for (int i = 0; i <= 31 && count > 0; i++) {
            if ((num1 & (1 << i)) == 0) {
                result |= (1 << i);
                count--;
            }
        }

        return result;
    }
}
