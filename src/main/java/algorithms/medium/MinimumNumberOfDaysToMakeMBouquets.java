package algorithms.medium;

public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        MinimumNumberOfDaysToMakeMBouquets minDays = new MinimumNumberOfDaysToMakeMBouquets();
        System.out.println("Output:\t" + minDays.minDays(new int[]{1, 10, 3, 10, 2}, 3, 2));
        System.out.println("Output:\t" + minDays.minDays(new int[]{1, 10, 3, 10, 2}, 3, 1));
        System.out.println("Output:\t" + minDays.minDays(new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3));
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minimumDaysNeeded = Integer.MAX_VALUE;

        for (int bloom : bloomDay) {
            max = Math.max(bloom, max);
            min = Math.min(bloom, min);
        }

        while (min <= max) {
            int mid = min + (max - min) / 2;
            int adjacentflowers = 0;
            int bouquets = 0;

            for (int bloom : bloomDay) {
                if (bloom <= mid)
                    adjacentflowers++;
                else
                    adjacentflowers = 0;

                if (adjacentflowers == k) {
                    bouquets++;
                    adjacentflowers = 0;
                }
            }

            if (bouquets >= m) {
                minimumDaysNeeded = Math.min(mid, minimumDaysNeeded);
                max = mid - 1;
            } else
                min = mid + 1;
        }
        return minimumDaysNeeded;
    }
}
