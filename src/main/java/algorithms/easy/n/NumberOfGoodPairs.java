//https://leetcode.com/problems/number-of-good-pairs/
package algorithms.easy.n;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        NumberOfGoodPairs pairs = new NumberOfGoodPairs();
        System.out.println("Output:\t" + pairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        System.out.println("Output:\t" + pairs.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        System.out.println("Output:\t" + pairs.numIdenticalPairs(new int[]{1, 2, 3}));
    }

    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        int[] count = new int[101];
        for (int num : nums) {
            answer += count[num];
            count[num]++;
        }
        return answer;
    }
}
