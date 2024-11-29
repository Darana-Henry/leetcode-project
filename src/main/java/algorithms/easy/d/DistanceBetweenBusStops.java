//https://leetcode.com/problems/distance-between-bus-stops/
package algorithms.easy.d;

public class DistanceBetweenBusStops {
    public static void main(String[] args) {
        DistanceBetweenBusStops busStops = new DistanceBetweenBusStops();
        System.out.println("Output:\t" + busStops.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
        System.out.println("Output:\t" + busStops.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2));
        System.out.println("Output:\t" + busStops.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3));
    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dist = 0, wrapped = 0;

        for (int d : distance)
            wrapped += d;

        if (start < destination) for (int i = start; i < destination; i++)
            dist += distance[i];
        else for (int i = destination; i < start; i++)
            dist += distance[i];

        return Math.min(dist, wrapped - dist);
    }
}
