//https://leetcode.com/problems/percentage-of-letter-in-string/
package algorithms.easy.p;

public class PercentageOfLetterInString {
    public static void main(String[] args) {
        PercentageOfLetterInString percent = new PercentageOfLetterInString();
        System.out.println("Output:\t" + percent.percentageLetter("foobar", 'o'));
        System.out.println("Output:\t" + percent.percentageLetter("jjjj", 'k'));
    }

    public int percentageLetter(String s, char letter) {
        int answer = 0;
        for (char ch : s.toCharArray())
            if (ch == letter) answer++;
        return (answer * 100) / s.length();
    }
}
