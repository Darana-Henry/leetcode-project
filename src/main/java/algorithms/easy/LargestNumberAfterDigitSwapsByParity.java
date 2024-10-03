//https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/
package algorithms.easy;

import java.util.PriorityQueue;

public class LargestNumberAfterDigitSwapsByParity {
    public static void main(String[] args) {
        LargestNumberAfterDigitSwapsByParity swaps = new LargestNumberAfterDigitSwapsByParity();
        System.out.println("Output:\t" + swaps.largestInteger(1234));
        System.out.println("Output:\t" + swaps.largestInteger(65875));
    }

    public int largestInteger(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();

        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            temp /= 10;
            if (digit % 2 == 0) even.add(digit);
            else odd.add(digit);
        }

        temp = num;
        int answer = 0;
        int multiplier = 1;

        while (temp != 0) {
            int digit = temp % 10;
            temp /= 10;
            int n = 0;
            if (digit % 2 == 0) n = even.poll();
            else n = odd.poll();
            answer = n * multiplier + answer;
            multiplier *= 10;
        }

        return answer;

    }
}
