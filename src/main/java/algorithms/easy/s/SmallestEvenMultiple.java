//https://leetcode.com/problems/smallest-even-multiple/
package algorithms.easy.s;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        SmallestEvenMultiple even = new SmallestEvenMultiple();
        System.out.println("Output:\t" + even.smallestEvenMultiple(5));
        System.out.println("Output:\t" + even.smallestEvenMultiple(6));
    }

    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;
        else return n * 2;
    }
}
