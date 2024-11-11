//https://leetcode.com/problems/alternating-digit-sum/
package algorithms.easy.a;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        AlternatingDigitSum alternating = new AlternatingDigitSum();
        System.out.println("Output:\t" + alternating.alternateDigitSum(521));
        System.out.println("Output:\t" + alternating.alternateDigitSum(11));
        System.out.println("Output:\t" + alternating.alternateDigitSum(886996));
    }

    public int alternateDigitSum(int n) {
        String num = n + "";
        int answer = 0;
        int prod = 1;

        for (char ch : num.toCharArray()) {
            answer += (ch - '0') * prod;
            prod *= -1;
        }

        return answer;
    }
}
