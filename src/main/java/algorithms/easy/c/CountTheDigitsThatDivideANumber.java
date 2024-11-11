//https://leetcode.com/problems/count-the-digits-that-divide-a-number/
package algorithms.easy.c;

public class CountTheDigitsThatDivideANumber {
    public static void main(String[] args) {
        CountTheDigitsThatDivideANumber divide = new CountTheDigitsThatDivideANumber();
        System.out.println("Output:\t" + divide.countDigits(7));
        System.out.println("Output:\t" + divide.countDigits(121));
        System.out.println("Output:\t" + divide.countDigits(1248));
    }

    public int countDigits(int num) {
        int answer = 0;

        for (int i = num; i > 0; i /= 10)
            if (i != 0 && (num % (i % 10) == 0)) answer++;

        return answer;
    }
}
