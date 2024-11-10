//https://leetcode.com/problems/sign-of-the-product-of-an-array/
package algorithms.easy.s;

public class SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        SignOfTheProductOfAnArray sign = new SignOfTheProductOfAnArray();
        System.out.println("Output:\t" + sign.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1}));
        System.out.println("Output:\t" + sign.arraySign(new int[]{1, 5, 0, 2, -3}));
        System.out.println("Output:\t" + sign.arraySign(new int[]{-1, 1, -1, 1, -1}));
    }

    public int arraySign(int[] nums) {
        int answer = 1;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) answer *= -1;
        }
        return answer;
    }
}
