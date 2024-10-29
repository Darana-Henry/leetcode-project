//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
package algorithms.medium.t;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        TwoSumIIInputArrayIsSorted twoSum = new TwoSumIIInputArrayIsSorted();
        System.out.println("Output:\t" + twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        System.out.println("Output:\t" + twoSum.twoSum(new int[]{2, 3, 4}, 6));
        System.out.println("Output:\t" + twoSum.twoSum(new int[]{-1, 0}, -1));
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                answer[0] = left + 1;
                answer[1] = right + 1;
                return answer;
            } else if (sum > target)
                right--;
            else
                left++;
        }
        return answer;
    }
}
