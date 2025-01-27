//https://leetcode.com/problems/find-xor-beauty-of-array/
package algorithms.medium.f;

public class FindXORBeautyOfArray {
    public static void main(String[] args) {
        FindXORBeautyOfArray obj = new FindXORBeautyOfArray();
        System.out.println("Output:\t" + obj.xorBeauty(new int[]{1, 4}));
        System.out.println("Output:\t" + obj.xorBeauty(new int[]{15, 45, 20, 2, 34, 35, 5, 44, 32, 30}));
    }

    public int xorBeauty(int[] nums) {
        int answer = 0;

        for (int num : nums)
            answer ^= num;

        return answer;
    }
}
