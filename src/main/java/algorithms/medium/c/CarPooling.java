//https://leetcode.com/problems/car-pooling/
package algorithms.medium.c;

public class CarPooling {
    public static void main(String[] args) {
        CarPooling obj = new CarPooling();
        System.out.println("Output:\t" + obj.carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 4));
        System.out.println("Output:\t" + obj.carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 5));
    }

    public boolean carPooling(int[][] trips, int capacity) {
        int[] pass = new int[1001];

        for (int[] trip : trips) {
            int count = trip[0];
            int start = trip[1];
            int end = trip[2];
            pass[start] += count;
            pass[end] -= count;
        }

        int curr = 0;
        for (int p : pass) {
            curr += p;
            if (curr > capacity) return false;
        }

        return true;
    }
}
