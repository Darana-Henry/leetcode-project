//https://leetcode.com/problems/reverse-prefix-of-word/
package algorithms.easy.r;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        ReversePrefixOfWord reverse = new ReversePrefixOfWord();
        System.out.println("Output:\t" + reverse.reversePrefixOptimized("abcdefd", 'd'));
        System.out.println("Output:\t" + reverse.reversePrefixOptimized("xyxzxe", 'z'));
        System.out.println("Output:\t" + reverse.reversePrefixOptimized("abcd", 'z'));
        System.out.println("Output:\t" + reverse.reversePrefix("abcdefd", 'd'));
        System.out.println("Output:\t" + reverse.reversePrefix("xyxzxe", 'z'));
        System.out.println("Output:\t" + reverse.reversePrefix("abcd", 'z'));
    }

    public String reversePrefixOptimized(String word, char ch) {
        int occ = word.indexOf(ch);
        if (occ == -1) return word;

        char[] chars = word.toCharArray();
        for (int i = 0; i < occ; i++, occ--) {
            char temp = chars[i];
            chars[i] = chars[occ];
            chars[occ] = temp;
        }

        return String.valueOf(chars);
    }

    public String reversePrefix(String word, char ch) {
        if (!word.contains(ch + "")) return word;

        int occ = word.indexOf(ch);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= occ; i++)
            sb.append(word.charAt(i));
        sb.reverse();

        for (int i = occ + 1; i < word.length(); i++)
            sb.append(word.charAt(i));

        return sb.toString();
    }
}
