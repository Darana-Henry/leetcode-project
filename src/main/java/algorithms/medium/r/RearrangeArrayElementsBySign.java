//https://leetcode.com/problems/rearrange-array-elements-by-sign/
package algorithms.medium.r;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        RearrangeArrayElementsBySign obj = new RearrangeArrayElementsBySign();
        System.out.println("Output:\t" + obj.rearrangeArray(new int[]{3, 1, -2, -5, 2, -4}));
        System.out.println("Output:\t" + obj.rearrangeArray(new int[]{-1, 1}));

    }

    public int[] rearrangeArray(int[] nums) {
        int[] answer = new int[nums.length];
        int pos = 0, neg = 1;

        for (int num : nums) {
            if (num > 0) {
                answer[pos] = num;
                pos += 2;
            } else {
                answer[neg] = num;
                neg += 2;
            }
        }

        return answer;
    }
}
