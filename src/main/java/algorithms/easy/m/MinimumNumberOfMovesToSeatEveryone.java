//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/
package algorithms.easy.m;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        MinimumNumberOfMovesToSeatEveryone moves = new MinimumNumberOfMovesToSeatEveryone();
        System.out.println("Output:\t" + moves.minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4}));
        System.out.println("Output:\t" + moves.minMovesToSeat(new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6}));
        System.out.println("Output:\t" + moves.minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6}));
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;

        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
}
