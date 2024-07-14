package patterns.subsets;

import java.util.ArrayList;
import java.util.List;

public class LearningSubsets {
    public static void main(String[] args) {
        LearningSubsets subsets = new LearningSubsets();
        System.out.println("Output:\t" + subsets.subset(new int[]{1, 2}));
        System.out.println("Output:\t" + subsets.subset(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        backTracking(nums, output, 0, new ArrayList<>());
        return output;
    }

    public void backTracking(int[] nums, List<List<Integer>> output, int index, List<Integer> current) {
        output.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            backTracking(nums, output, i + 1, current);
            current.remove(current.size() - 1);
        }
    }
}
