//https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
package algorithms.easy.r;

public class RemoveDigitFromNumberToMaximizeResult {
    public static void main(String[] args) {
        RemoveDigitFromNumberToMaximizeResult remove = new RemoveDigitFromNumberToMaximizeResult();
        System.out.println("Output:\t" + remove.removeDigit("123", '3'));
        System.out.println("Output:\t" + remove.removeDigit("1231", '1'));
        System.out.println("Output:\t" + remove.removeDigit("551", '5'));
    }

    public String removeDigit(String number, char digit) {
        int lastOcc = -1;
        for (int i = 0; i < number.length(); i++) {
            char curr = number.charAt(i);
            if (curr == digit) {
                lastOcc = i;
                if ((i + 1) < number.length() && curr < number.charAt(i + 1)) break;
            }
        }
        return number.substring(0, lastOcc) + number.substring(lastOcc + 1);
    }
}
