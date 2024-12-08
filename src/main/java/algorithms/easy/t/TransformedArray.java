//https://leetcode.com/problems/transformed-array/
package algorithms.easy.t;

public class TransformedArray {
    public static void main(String[] args) {
        TransformedArray transformedArray = new TransformedArray();
        System.out.println("Output:\t" + transformedArray.constructTransformedArray(new int[]{3, -2, 1, 1}));
        System.out.println("Output:\t" + transformedArray.constructTransformedArray(new int[]{-1, 4, -1}));
        System.out.println("Output:\t" + transformedArray.constructTransformedArrayOptimized(new int[]{3, -2, 1, 1}));
        System.out.println("Output:\t" + transformedArray.constructTransformedArrayOptimized(new int[]{-1, 4, -1}));
    }

    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) result[i] = nums[i];
            else if (nums[i] > 0) {
                int k = (i + nums[i]) % n;
                result[i] = nums[k];
            } else if (nums[i] < 0) {
                int k = (i + nums[i]) % n;
                k += k < 0 ? n : 0;
                result[i] = nums[k];
            }
        }

        return result;
    }

    public int[] constructTransformedArrayOptimized(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++)
            result[i] = nums[(i + nums[i] % n + n) % n];

        return result;
    }
}
