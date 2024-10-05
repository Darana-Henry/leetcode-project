//https://leetcode.com/problems/next-greater-element-i/
package algorithms.easy.n;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static void main(String[] args) {
        NextGreaterElementI great = new NextGreaterElementI();
        System.out.println("Output:\t" + great.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        System.out.println("Output:\t" + great.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[stack.peek()] <= nums2[i])
                stack.pop();

            if (!stack.isEmpty())
                map.put(nums2[i], nums2[stack.peek()]);
            else
                map.put(nums2[i], -1);

            stack.push(i);
        }

        int i = 0;
        for (int num : nums1) {
            result[i++] = map.get(num);
        }
        return result;
    }
}
