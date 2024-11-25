//https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
package algorithms.easy.m;

public class MinimumChangesToMakeAlternatingBinaryString {
    public static void main(String[] args) {
        MinimumChangesToMakeAlternatingBinaryString binary = new MinimumChangesToMakeAlternatingBinaryString();
        System.out.println("Output:\t" + binary.minOperations("0100"));
        System.out.println("Output:\t" + binary.minOperations("10"));
        System.out.println("Output:\t" + binary.minOperations("1111"));
    }

    public int minOperations(String s) {
        int answer = 0, n = s.length();

        for (int i = 0; i < n; i++)
            if (s.charAt(i) != "01".charAt(i & 1)) answer++;

        return Math.min(answer, n - answer);
    }
}
