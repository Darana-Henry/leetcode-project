//https://leetcode.com/problems/maximum-height-of-a-triangle/
package algorithms.easy.m;

public class MaximumHeightOfATriangle {
    public static void main(String[] args) {
        MaximumHeightOfATriangle height = new MaximumHeightOfATriangle();
        System.out.println("Output:\t" + height.maxHeightOfTriangle(2, 4));
        System.out.println("Output:\t" + height.maxHeightOfTriangle(2, 1));
        System.out.println("Output:\t" + height.maxHeightOfTriangle(1, 1));
        System.out.println("Output:\t" + height.maxHeightOfTriangle(10, 1));
    }

    public int maxHeightOfTriangle(int red, int blue) {
        int answer = 0, even = 0, odd = 0;

        for (int i = 1; i < 20; i++) {
            if ((i & 1) == 0) even += i;
            else odd += i;
            if ((red >= even && blue >= odd) || (blue >= even && red >= odd)) answer = i;
            else return answer;
        }

        return answer;
    }
}
