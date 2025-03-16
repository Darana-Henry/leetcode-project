//https://leetcode.com/problems/minimum-time-to-repair-cars/
package algorithms.medium.m;

public class MinimumTimeToRepairCars {
    public static void main(String[] args) {
        MinimumTimeToRepairCars obj = new MinimumTimeToRepairCars();
        System.out.println("Output:\t" + obj.repairCars(new int[]{1, 2, 3, 4}, 10));
        System.out.println("Output:\t" + obj.repairCars(new int[]{5, 1, 8}, 6));
    }

    public long repairCars(int[] ranks, int cars) {
        long min = 0, max = (long) ranks[0] * cars * cars;

        while (min < max) {
            long mid = (min + max) >> 1;
            int count = 0;

            for (int rank : ranks)
                count += Math.sqrt(mid / rank);

            if (count >= cars) max = mid;
            else min = mid + 1;
        }

        return min;
    }
}
