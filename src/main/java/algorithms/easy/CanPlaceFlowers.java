//https://leetcode.com/problems/can-place-flowers/
package algorithms.easy;

public class CanPlaceFlowers {
    public static void main(String[] args) {

        CanPlaceFlowers flowers = new CanPlaceFlowers();
        System.out.println("Output:\t" + flowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        System.out.println("Output:\t" + flowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int emptySlots = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int previous = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;

                if (previous == 0 && next == 0) {
                    flowerbed[i] = 1;
                    emptySlots++;
                }
            }
        }

        if (emptySlots >= n)
            return true;
        return false;
    }
}

