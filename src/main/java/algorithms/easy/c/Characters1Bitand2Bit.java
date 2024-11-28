//https://leetcode.com/problems/1-bit-and-2-bit-characters/
package algorithms.easy.c;

public class Characters1Bitand2Bit {
    public static void main(String[] args) {
        Characters1Bitand2Bit chars = new Characters1Bitand2Bit();
        System.out.println("Output:\t" + chars.isOneBitCharacter(new int[]{1, 0, 0}));
        System.out.println("Output:\t" + chars.isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }

    public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        int n = bits.length;
        while (index < n - 1) index += bits[index] + 1;
        return index == n - 1;
    }
}
