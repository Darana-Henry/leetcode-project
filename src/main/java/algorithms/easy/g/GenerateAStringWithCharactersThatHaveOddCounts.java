//https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
package algorithms.easy.g;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {
        GenerateAStringWithCharactersThatHaveOddCounts odds = new GenerateAStringWithCharactersThatHaveOddCounts();
        System.out.println("Output:\t" + odds.generateTheString(4));
        System.out.println("Output:\t" + odds.generateTheString(2));
        System.out.println("Output:\t" + odds.generateTheString(7));
    }

    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        if (n % 2 == 1) {
            for (int i = 0; i < n; i++)
                sb.append("a");
        } else {
            for (int i = 0; i < n - 1; i++)
                sb.append("a");
            sb.append("b");
        }

        return sb.toString();
    }
}
