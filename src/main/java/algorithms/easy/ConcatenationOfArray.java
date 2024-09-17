//https://leetcode.com/problems/concatenation-of-array/
package algorithms.easy;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        ConcatenationOfArray concat = new ConcatenationOfArray();
        System.out.println("Output:\t" + concat.getConcatenation(new int[]{1, 2, 1}));
        System.out.println("Output:\t" + concat.getConcatenation(new int[]{1, 3, 2, 1}));
    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n * 2];
        int index = 0;
        for (int i = 0; i < n * 2; i++)
            answer[i] = nums[index++ % n];
        return answer;
    }
}
