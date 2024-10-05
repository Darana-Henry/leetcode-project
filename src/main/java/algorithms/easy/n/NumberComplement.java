//https://leetcode.com/problems/number-complement/
package algorithms.easy.n;

public class NumberComplement {
    public static void main(String[] args) {
        NumberComplement complement = new NumberComplement();
        System.out.println("Output:\t" + complement.findComplement(5));
        System.out.println("Output:\t" + complement.findComplement(1));
    }

    public int findComplement(int num) {
        int answer = 0;
        int power = 1;
        while (num > 0) {
            answer += ((num % 2) ^ 1) * power;
            power *= 2;
            num /= 2;
        }
        return answer;
    }
}
