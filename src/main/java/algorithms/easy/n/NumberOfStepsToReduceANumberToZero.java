//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
package algorithms.easy.n;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        NumberOfStepsToReduceANumberToZero reduce = new NumberOfStepsToReduceANumberToZero();
        System.out.println("Output:\t" + reduce.numberOfSteps(14));
        System.out.println("Output:\t" + reduce.numberOfSteps(8));
        System.out.println("Output:\t" + reduce.numberOfSteps(123));
    }

    public int numberOfSteps(int num) {
        int answer = 0;
        while (num != 0) {
            num = ((num & 1) == 1) ? num - 1 : num >> 1;
            answer++;
        }
        return answer;
    }
}
