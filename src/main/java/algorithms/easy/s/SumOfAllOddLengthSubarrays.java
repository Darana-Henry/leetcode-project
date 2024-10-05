//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
package algorithms.easy.s;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        SumOfAllOddLengthSubarrays sumOdd = new SumOfAllOddLengthSubarrays();
        System.out.println("Output:\t" + sumOdd.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
        System.out.println("Output:\t" + sumOdd.sumOddLengthSubarrays(new int[]{1, 2}));
        System.out.println("Output:\t" + sumOdd.sumOddLengthSubarrays(new int[]{10, 11, 12}));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if ((j - i + 1) % 2 == 1) total += sum;
            }
        }

        return total;
    }
}
