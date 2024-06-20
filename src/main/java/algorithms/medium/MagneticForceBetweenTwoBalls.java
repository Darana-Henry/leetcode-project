//https://leetcode.com/problems/magnetic-force-between-two-balls/description/
package algorithms.medium;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
        MagneticForceBetweenTwoBalls magnetic = new MagneticForceBetweenTwoBalls();
        System.out.println("Output:\t" + magnetic.maxDistance(new int[]{1, 2, 3, 4, 7}, 3));
        System.out.println("Output:\t" + magnetic.maxDistance(new int[]{5, 4, 3, 2, 1, 1000000000}, 2));
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int min = 1;
        int max = position[position.length - 1] - position[0];
        int result = 0;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (canPlace(mid, position, m)) {
                result = mid;
                min = mid + 1;
            } else
                max = mid - 1;
        }
        return result;
    }

    public boolean canPlace(int force, int[] position, int m) {
        int prev = position[0];
        int count = 1;

        for (int i = 1; i < position.length; i++) {
            int curr = position[i];
            if (curr - prev >= force) {
                count++;
                prev = curr;
            }
            if (count == m)
                break;
        }
        return count == m;
    }
}
