//https://leetcode.com/problems/build-array-from-permutation/
package algorithms.easy.b;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        BuildArrayFromPermutation perm = new BuildArrayFromPermutation();
        System.out.println("Output:\t" + perm.buildArray(new int[]{0, 2, 1, 5, 3, 4}));
        System.out.println("Output:\t" + perm.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++)
            answer[i] = nums[nums[i]];
        return answer;
    }
}
