package algorithms.easy;//https://leetcode.com/problems/length-of-last-word/description/

public class LengthOfLastWord {

    public static void main(String[] args) {

        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = "   fly me   to   the moon  ";
        System.out.println("Output:\t" + lengthOfLastWord.lengthOfLastWord(s));

        s = "luffy is still joyboy";
        System.out.println("Output:\t" + lengthOfLastWord.lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                count++;
            else
                return count;
        }
        return count;
    }
}
