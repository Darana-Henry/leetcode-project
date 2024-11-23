//https://leetcode.com/problems/goat-latin/
package algorithms.easy.g;

public class GoatLatin {
    public static void main(String[] args) {
        GoatLatin goat = new GoatLatin();
        System.out.println("Output:\t" + goat.toGoatLatin("I speak Goat Latin"));
        System.out.println("Output:\t" + goat.toGoatLatin("The quick brown fox jumped over the lazy dog"));
        System.out.println("Output:\t" + goat.toGoatLatinOptimized("I speak Goat Latin"));
        System.out.println("Output:\t" + goat.toGoatLatinOptimized("The quick brown fox jumped over the lazy dog"));
    }

    public String toGoatLatin(String sentence) {
        int repeat = 1;
        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");
        StringBuffer sb = new StringBuffer();

        for (String word : words) {
            char ch = word.charAt(0);
            if (vowels.indexOf(ch) != -1) sb.append(word);
            else {
                sb.append(word.substring(1));
                sb.append(ch);
            }

            sb.append("ma");
            sb.append("a".repeat(repeat++));
            sb.append(" ");

        }

        return sb.substring(0, sb.length() - 1);

    }

    public String toGoatLatinOptimized(String sentence) {
        int repeat = 1;
        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");
        StringBuffer sb = new StringBuffer();

        for (String word : words) {
            char ch = word.charAt(0);
            if (vowels.indexOf(ch) != -1) sb.append(word);
            else {
                sb.append(word.substring(1));
                sb.append(ch);
            }

            sb.append("ma");
            sb.append("a".repeat(repeat++));
            sb.append(" ");

        }

        return sb.substring(0, sb.length() - 1);

    }

}
