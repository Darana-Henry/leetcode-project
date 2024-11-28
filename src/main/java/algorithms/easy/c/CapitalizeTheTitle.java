//https://leetcode.com/problems/capitalize-the-title/
package algorithms.easy.c;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        CapitalizeTheTitle capitalize = new CapitalizeTheTitle();
        System.out.println("Output:\t" + capitalize.capitalizeTitle("capiTalIze tHe titLe"));
        System.out.println("Output:\t" + capitalize.capitalizeTitle("First leTTeR of EACH Word"));
        System.out.println("Output:\t" + capitalize.capitalizeTitle("i lOve leetcode"));
    }

    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 2) words[i] = word.toLowerCase();
            else words[i] = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }
}
