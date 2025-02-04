//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
package algorithms.medium.c;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        CapacityToShipPackagesWithinDDays obj = new CapacityToShipPackagesWithinDDays();
        System.out.println("Output:\t" + obj.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
        System.out.println("Output:\t" + obj.shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3));
        System.out.println("Output:\t" + obj.shipWithinDays(new int[]{1, 2, 3, 1, 1}, 4));
    }

    public int shipWithinDays(int[] weights, int days) {
        long min = 0, max = 0;

        for (int weight : weights) {
            min = Math.max(min, weight);
            max += weight;
        }

        while (min < max) {
            long mid = min + (max - min) / 2;

            int sum = 0, count = 1;
            for (int weight : weights) {
                if (sum + weight > mid) {
                    count++;
                    sum = weight;
                } else sum += weight;
            }

            if (count > days) min = mid + 1;
            else max = mid;
        }

        return (int) min;
    }
}
