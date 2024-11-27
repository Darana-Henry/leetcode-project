//https://leetcode.com/problems/remove-trailing-zeros-from-a-string/
package algorithms.easy.r;

public class RemoveTrailingZerosFromAString {
    public static void main(String[] args) {
        RemoveTrailingZerosFromAString trailing = new RemoveTrailingZerosFromAString();
        System.out.println("Output:\t" + trailing.removeTrailingZeros("51230100"));
        System.out.println("Output:\t" + trailing.removeTrailingZeros("123"));
    }

    public String removeTrailingZeros(String num) {
        for (int i = num.length() - 1; i >= 0; i--)
            if (num.charAt(i) != '0') return num.substring(0, i + 1);

        return "";
    }
}
