//https://leetcode.com/problems/minimum-cuts-to-divide-a-circle/
package algorithms.easy.m;

public class MinimumCutsToDivideACircle {
    public static void main(String[] args) {
        MinimumCutsToDivideACircle cuts = new MinimumCutsToDivideACircle();
        System.out.println("Output:\t" + cuts.numberOfCuts(4));
        System.out.println("Output:\t" + cuts.numberOfCuts(3));
    }

    public int numberOfCuts(int n) {
        return (n > 1 && n % 2 == 1) ? n : (n >> 1);
    }
}
