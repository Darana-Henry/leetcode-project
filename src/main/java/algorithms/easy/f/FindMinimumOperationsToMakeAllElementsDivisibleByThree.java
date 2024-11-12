//https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/
package algorithms.easy.f;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public static void main(String[] args) {
        FindMinimumOperationsToMakeAllElementsDivisibleByThree by3 = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        System.out.println("Output:\t" + by3.minimumOperations(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + by3.minimumOperations(new int[]{3, 6, 9}));
    }

    public int minimumOperations(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            if (num % 3 != 0) answer++;
        }

        return answer;
    }
}
