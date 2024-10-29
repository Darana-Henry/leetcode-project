//https://leetcode.com/problems/koko-eating-bananas/
package algorithms.medium.k;

public class KokoEatingBananas {
    public static void main(String[] args) {
        KokoEatingBananas koko = new KokoEatingBananas();
        System.out.println("Output:\t" + koko.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        System.out.println("Output:\t" + koko.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        System.out.println("Output:\t" + koko.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 1;

        for (int pile : piles)
            maxSpeed = Math.max(maxSpeed, pile);

        while (minSpeed < maxSpeed) {
            int eatingSpeed = minSpeed + (maxSpeed - minSpeed) / 2;
            int timeNeeded = 0;
            for (int pile : piles) {
                if (pile < eatingSpeed)
                    timeNeeded++;
                else
                    timeNeeded += (pile + eatingSpeed - 1) / eatingSpeed;
            }

            if (timeNeeded > h)
                minSpeed = eatingSpeed + 1;
            else
                maxSpeed = eatingSpeed;
        }
        return minSpeed;
    }
}
