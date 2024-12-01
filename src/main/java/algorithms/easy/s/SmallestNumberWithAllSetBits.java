//https://leetcode.com/problems/smallest-number-with-all-set-bits/
package algorithms.easy.s;

public class SmallestNumberWithAllSetBits {
    public static void main(String[] args) {
        SmallestNumberWithAllSetBits smallest = new SmallestNumberWithAllSetBits();
        System.out.println("Output:\t" + smallest.smallestNumber(5));
        System.out.println("Output:\t" + smallest.smallestNumber(10));
        System.out.println("Output:\t" + smallest.smallestNumber(3));
    }

    public int smallestNumber(int n) {
        int answer = 1;
        while (answer < n) answer = answer * 2 + 1;
        return answer;
    }
}
