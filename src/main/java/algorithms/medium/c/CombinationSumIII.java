//https://leetcode.com/problems/combination-sum-iii/
package algorithms.medium.c;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        CombinationSumIII sum3 = new CombinationSumIII();
        System.out.println("Output:\t" + sum3.combinationSum3(3, 7));
        System.out.println("Output:\t" + sum3.combinationSum3(3, 9));
        System.out.println("Output:\t" + sum3.combinationSum3(4, 1));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> output = new ArrayList<>();
        picker(output, k, n, 1, new ArrayList<>());
        return output;
    }

    public void picker(List<List<Integer>> output, int k, int n, int currentNum, List<Integer> current) {
        if (k == 0 && n == 0) {
            output.add(current);
            return;
        }
        if (currentNum > 9 || k < 0 || n < 0) return;

        List<Integer> ephem = new ArrayList<>(current);
        ephem.add(currentNum);

        picker(output, k - 1, n - currentNum, currentNum + 1, ephem);
        picker(output, k, n, currentNum + 1, current);
    }
}
