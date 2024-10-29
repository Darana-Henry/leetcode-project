package algorithms.medium.p;//https://leetcode.com/problems/product-of-array-except-self/description/

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf exceptSelf = new ProductOfArrayExceptSelf();
        System.out.println("Output:\t" + exceptSelf.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
        System.out.println("Output:\t" + exceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];
        int currentProduct = 1;

        for (int locator = 0; locator < nums.length; locator++) {
            currentProduct = currentProduct * nums[locator];
            left[locator] = currentProduct;
        }

        currentProduct = 1;
        for (int locator = (nums.length - 1); locator >= 0; locator--) {
            currentProduct = currentProduct * nums[locator];
            right[locator] = currentProduct;
        }

        output[0] = right[1];
        output[nums.length - 1] = left[nums.length - 2];

        for (int locator = 1; locator < nums.length - 1; locator++) {
            output[locator] = left[locator - 1] * right[locator + 1];
        }


        return output;
    }
}
