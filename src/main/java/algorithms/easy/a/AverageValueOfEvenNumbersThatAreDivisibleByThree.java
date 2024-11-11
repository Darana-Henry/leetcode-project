//https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
package algorithms.easy.a;

public class AverageValueOfEvenNumbersThatAreDivisibleByThree {
    public static void main(String[] args) {
        AverageValueOfEvenNumbersThatAreDivisibleByThree avg = new AverageValueOfEvenNumbersThatAreDivisibleByThree();
        System.out.println("Output:\t" + avg.averageValue(new int[]{1, 3, 6, 10, 12, 15}));
        System.out.println("Output:\t" + avg.averageValue(new int[]{1, 2, 4, 7, 10}));
    }

    public int averageValue(int[] nums) {
        int sum = 0, count = 0;

        for (int num : nums) {
            if (num % 6 == 0) {
                sum += num;
                count++;
            }
        }

        return count == 0 ? 0 : sum / count;
    }
}
