//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
package algorithms.easy.c;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        CheckIfTheSentenceIsPangram pangram = new CheckIfTheSentenceIsPangram();
        System.out.println("Output:\t" + pangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println("Output:\t" + pangram.checkIfPangram("leetcode"));
        System.out.println("Output:\t" + pangram.checkIfPangramMasking("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println("Output:\t" + pangram.checkIfPangramMasking("leetcode"));
    }

    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];

        for (char ch : sentence.toCharArray())
            count[ch - 'a']++;

        for (int val : count)
            if (val == 0) return false;

        return true;
    }

    public boolean checkIfPangramMasking(String sentence) {
        int mask = 0;

        for (int i = 0; i < sentence.length(); i++)
            mask |= 1 << (sentence.charAt(i) - 'a');

        return mask == (1 << 26) - 1;
    }
}
