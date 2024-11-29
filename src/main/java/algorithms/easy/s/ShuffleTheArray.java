//https://leetcode.com/problems/shuffle-the-array/
package algorithms.easy.s;

public class ShuffleTheArray {
    public static void main(String[] args) {
        ShuffleTheArray shuffle = new ShuffleTheArray();
        System.out.println("Output:\t" + shuffle.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
        System.out.println("Output:\t" + shuffle.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4));
        System.out.println("Output:\t" + shuffle.shuffle(new int[]{1, 1, 2, 2}, 2));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2 * n];
        for (int i = 0, j = 0; i < n; i++) {
            answer[j++] = nums[i];
            answer[j++] = nums[i + n];
        }
        return answer;
    }
}
