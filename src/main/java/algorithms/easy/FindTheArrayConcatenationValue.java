//https://leetcode.com/problems/find-the-array-concatenation-value/
package algorithms.easy;

public class FindTheArrayConcatenationValue {
    public static void main(String[] args) {
        FindTheArrayConcatenationValue concat = new FindTheArrayConcatenationValue();
        System.out.println("Output:\t" + concat.findTheArrayConcVal(new int[]{7, 52, 2, 4}));
        System.out.println("Output:\t" + concat.findTheArrayConcVal(new int[]{5, 14, 13, 8, 12}));
        System.out.println("Output:\t" + concat.findTheArrayConcValOptimized(new int[]{7, 52, 2, 4}));
        System.out.println("Output:\t" + concat.findTheArrayConcValOptimized(new int[]{5, 14, 13, 8, 12}));
    }

    public long findTheArrayConcVal(int[] nums) {
        if (nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        long sum = 0;

        while (left < right) {
            String concat = nums[left++] + "" + nums[right--];
            sum += Long.valueOf(concat);
            if (left == right) sum += (long) nums[left++];
        }

        return sum;
    }

    public long findTheArrayConcValOptimized(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        long result = 0;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int lenRight = lengthOfNumber(nums[r]);
            result += (long) Math.pow(10, lenRight) * nums[l++] + nums[r--];
        }
        if (l == r) {
            result += nums[l];
        }
        return result;
    }

    private int lengthOfNumber(int num) {
        int l = 0;
        while (num != 0) {
            num /= 10;
            l++;
        }
        return l;
    }
}
