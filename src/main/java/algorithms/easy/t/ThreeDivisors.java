//https://leetcode.com/problems/three-divisors/
package algorithms.easy.t;

public class ThreeDivisors {
    public static void main(String[] args) {
        ThreeDivisors three = new ThreeDivisors();
        System.out.println("Output:\t" + three.isThree(2));
        System.out.println("Output:\t" + three.isThree(4));
    }

    public boolean isThree(int n) {
        int answer = 0;
        for (int i = 1; i <= n / i; i++)
            if (n % i == 0) answer += (n / i == i) ? 1 : 2;
        return answer == 3;
    }
}
