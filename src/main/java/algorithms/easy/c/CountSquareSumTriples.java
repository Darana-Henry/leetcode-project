//https://leetcode.com/problems/count-square-sum-triples/
package algorithms.easy.c;

public class CountSquareSumTriples {
    public static void main(String[] args) {
        CountSquareSumTriples triples = new CountSquareSumTriples();
        System.out.println("Output:\t" + triples.countTriples(5));
        System.out.println("Output:\t" + triples.countTriples(10));
    }

    public int countTriples(int n) {
        int answer = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int sum = a * a + b * b;
                int c = (int) Math.sqrt(sum);
                if (c <= n && c * c == sum) answer++;
            }
        }
        return answer;
    }
}
