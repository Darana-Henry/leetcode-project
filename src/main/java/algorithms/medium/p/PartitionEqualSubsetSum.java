//https://leetcode.com/problems/partition-equal-subset-sum/
package algorithms.medium.p;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        PartitionEqualSubsetSum partition = new PartitionEqualSubsetSum();
        System.out.println("Output:\t" + partition.canPartition(new int[]{1, 5, 11, 5}));
        System.out.println("Output:\t" + partition.canPartition(new int[]{1, 2, 3, 5}));
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums)
            sum += num;

        if (sum % 2 != 0) return false;
        int target = sum / 2;
        boolean[] subsets = new boolean[target + 1];
        subsets[0] = true;

        for (int num : nums) {
            for (int i = target; i >= num; i--)
                subsets[i] = subsets[i] || subsets[i - num];
        }

        return subsets[target];
    }
}
