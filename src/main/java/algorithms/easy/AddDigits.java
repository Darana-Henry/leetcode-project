//https://leetcode.com/problems/add-digits/description/
package algorithms.easy;

public class AddDigits {
    public static void main(String[] args) {
        AddDigits digits = new AddDigits();
        System.out.println("Output:\t" + digits.addDigitsOptimized(38));
        System.out.println("Output:\t" + digits.addDigitsBruteForce(0));
    }

    public int addDigitsOptimized(int num) {
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : (num % 9));
    }

    public int addDigitsBruteForce(int num) {
        while (num > 9) {
            int remainder = num % 10;
            int firstHalf = num / 10;
            num = remainder + firstHalf;
        }
        return num;
    }
}
