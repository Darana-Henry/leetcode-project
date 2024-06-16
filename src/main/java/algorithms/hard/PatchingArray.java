//https://leetcode.com/problems/patching-array/description/
package algorithms.hard;

public class PatchingArray {
    public static void main(String[] args) {

        PatchingArray patching = new PatchingArray();
        System.out.println("Output:\t" + patching.minPatches(new int[]{1, 3}, 6));
        System.out.println("Output:\t" + patching.minPatches(new int[]{1, 5, 10}, 20));
        System.out.println("Output:\t" + patching.minPatches(new int[]{1, 2, 2}, 5));
        System.out.println("Output:\t" + patching.minPatches(new int[]{1, 2, 31, 33}, 2147483647));
    }

    public int minPatches(int[] nums, int n) {
        int patch = 0;
        int i = 0;
        long maxReach = 0;

        while (maxReach < n) {
            if (i < nums.length && nums[i] <= maxReach + 1) {
                maxReach += nums[i];
                i++;
            } else {
                maxReach += (maxReach + 1);
                patch++;
            }
        }
        return patch;
    }
}

