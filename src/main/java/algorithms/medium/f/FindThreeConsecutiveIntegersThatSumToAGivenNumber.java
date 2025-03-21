//https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/
package algorithms.medium.f;

public class FindThreeConsecutiveIntegersThatSumToAGivenNumber {
    public static void main(String[] args) {
        FindThreeConsecutiveIntegersThatSumToAGivenNumber obj = new FindThreeConsecutiveIntegersThatSumToAGivenNumber();
        System.out.println("Output:\t" + obj.sumOfThree(33));
        System.out.println("Output:\t" + obj.sumOfThree(4));
    }

    public long[] sumOfThree(long num) {
        if (num % 3 != 0) return new long[]{};
        long start = num / 3;
        return new long[]{start - 1, start, start + 1};
    }
}
