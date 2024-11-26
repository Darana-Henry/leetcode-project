//https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
package algorithms.easy.c;

public class CheckIfNumbersAreAscendingInASentence {
    public static void main(String[] args) {
        CheckIfNumbersAreAscendingInASentence ascending = new CheckIfNumbersAreAscendingInASentence();
        System.out.println(
                "Output:\t" + ascending.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
        System.out.println("Output:\t" + ascending.areNumbersAscending("hello world 5 x 5"));
        System.out.println("Output:\t" + ascending.areNumbersAscending(
                "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }

    public boolean areNumbersAscending(String s) {
        int prev = -1;
        String[] words = s.split(" ");

        for (String word : words) {
            if (Character.isDigit(word.charAt(0))) {
                int num = Integer.parseInt(word);
                if (prev >= num) return false;
                prev = num;
            }
        }
        return true;
    }
}
