//https://leetcode.com/problems/delete-characters-to-make-fancy-string/
package algorithms.easy.d;

public class DeleteCharactersToMakeFancyString {
    public static void main(String[] args) {
        DeleteCharactersToMakeFancyString fancy = new DeleteCharactersToMakeFancyString();
        System.out.println("Output:\t" + fancy.makeFancyString("leeetcode"));
        System.out.println("Output:\t" + fancy.makeFancyString("aaabaaaa"));
        System.out.println("Output:\t" + fancy.makeFancyString("aab"));
    }

    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int n = sb.length();
            if (n > 1 && sb.charAt(n - 1) == ch && sb.charAt(n - 2) == ch) continue;
            sb.append(ch);
        }

        return sb.toString();
    }
}
