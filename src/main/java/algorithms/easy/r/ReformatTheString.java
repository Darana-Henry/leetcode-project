//https://leetcode.com/problems/reformat-the-string/
package algorithms.easy.r;

public class ReformatTheString {
    public static void main(String[] args) {
        ReformatTheString reformat = new ReformatTheString();
        System.out.println("Output:\t" + reformat.reformat("a0b1c2"));
        System.out.println("Output:\t" + reformat.reformat("leetcode"));
        System.out.println("Output:\t" + reformat.reformat("1229857369"));
    }

    public String reformat(String s) {
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (char ch : s.toCharArray())
            if (Character.isDigit(ch)) digits.append(ch);
            else letters.append(ch);

        int dLen = digits.toString().length();
        int lLen = letters.toString().length();
        if (Math.abs(dLen - lLen) > 1) return "";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < Math.min(dLen, lLen); i++) {
            if (dLen < lLen) {
                answer.append(letters.toString().charAt(i));
                answer.append(digits.toString().charAt(i));
            } else {
                answer.append(digits.toString().charAt(i));
                answer.append(letters.toString().charAt(i));
            }
        }

        if (dLen > lLen) answer.append(digits.toString().charAt(dLen - 1));
        if (dLen < lLen) answer.append(letters.toString().charAt(lLen - 1));
        return answer.toString();
    }
}
