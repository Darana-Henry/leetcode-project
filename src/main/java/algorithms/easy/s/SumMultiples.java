//https://leetcode.com/problems/sum-multiples/
package algorithms.easy.s;

public class SumMultiples {
    public static void main(String[] args) {
        SumMultiples multiples = new SumMultiples();
        System.out.println("Output:\t" + multiples.sumOfMultiples(7));
        System.out.println("Output:\t" + multiples.sumOfMultiples(10));
        System.out.println("Output:\t" + multiples.sumOfMultiples(9));
    }

    public int sumOfMultiples(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++)
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) answer += i;

        return answer;
    }
}
