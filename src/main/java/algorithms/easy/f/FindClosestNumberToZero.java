//https://leetcode.com/problems/find-closest-number-to-zero/
package algorithms.easy.f;

public class FindClosestNumberToZero {
    public static void main(String[] args) {
        FindClosestNumberToZero closest = new FindClosestNumberToZero();
        System.out.println("Output:\t" + closest.findClosestNumber(new int[]{-4, -2, 1, 4, 8}));
        System.out.println("Output:\t" + closest.findClosestNumber(new int[]{2, -1, 1}));
    }

    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE, answer = 0;
        for (int num : nums) {
            int abs = Math.abs(num);
            if (abs < min || (abs == min && answer < num)) {
                min = abs;
                answer = num;
            }
        }
        return answer;
    }
}
