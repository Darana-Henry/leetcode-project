//https://leetcode.com/problems/sum-of-unique-elements/
package algorithms.easy.s;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        SumOfUniqueElements unique = new SumOfUniqueElements();
        System.out.println("Output:\t" + unique.sumOfUnique(new int[]{1, 2, 3, 2}));
        System.out.println("Output:\t" + unique.sumOfUnique(new int[]{1, 1, 1, 1, 1}));
        System.out.println("Output:\t" + unique.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }

    public int sumOfUnique(int[] nums) {
        int answer = 0;
        int[] count = new int[101];

        for (int num : nums)
            count[num]++;

        for (int i = 0; i < 101; i++)
            if (count[i] == 1) answer += i;

        return answer;
    }
}
