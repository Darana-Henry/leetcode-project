//https://leetcode.com/problems/harshad-number/
package algorithms.easy.h;

public class HarshadNumber {
    public static void main(String[] args) {
        HarshadNumber harshad = new HarshadNumber();
        System.out.println("Output:\t" + harshad.sumOfTheDigitsOfHarshadNumber(18));
        System.out.println("Output:\t" + harshad.sumOfTheDigitsOfHarshadNumber(23));
    }

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;

        for (int i = x; i > 0; i /= 10)
            sum += i % 10;

        return (x % sum == 0) ? sum : -1;
    }
}
