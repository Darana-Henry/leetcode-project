//https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/
package algorithms.easy.c;

public class CountElementsWithStrictlySmallerAndGreaterElements {
    public static void main(String[] args) {
        CountElementsWithStrictlySmallerAndGreaterElements count = new CountElementsWithStrictlySmallerAndGreaterElements();
        System.out.println("Output:\t" + count.countElements(new int[]{11, 7, 2, 15}));
        System.out.println("Output:\t" + count.countElements(new int[]{-3, 3, 3, 90}));
    }

    public int countElements(int[] nums) {
        int answer = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int num : nums)
            if (min < num && num < max) answer++;

        return answer;
    }
}
