//https://leetcode.com/problems/count-integers-with-even-digit-sum/
package algorithms.easy.c;

public class CountIntegersWithEvenDigitSum {
    public static void main(String[] args) {
        CountIntegersWithEvenDigitSum evenDigitSum = new CountIntegersWithEvenDigitSum();
        System.out.println("Output:\t" + evenDigitSum.countEven(4));
        System.out.println("Output:\t" + evenDigitSum.countEvenOptimized(30));
    }

    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int j = i; j > 0; j /= 10) {
                sum += j % 10;
            }
            if (sum % 2 == 0) count++;
        }
        return count;
    }

    public int countEvenOptimized(int num) {
        int sum = num % 10 + (num / 10) % 10 + (num / 100) % 10 + (num / 1000) % 10;
        return (num - (sum & 1)) / 2;
    }
}
