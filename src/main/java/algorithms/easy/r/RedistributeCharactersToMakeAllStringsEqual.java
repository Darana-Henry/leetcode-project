//https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
package algorithms.easy.r;

public class RedistributeCharactersToMakeAllStringsEqual {
    public static void main(String[] args) {
        RedistributeCharactersToMakeAllStringsEqual distribute = new RedistributeCharactersToMakeAllStringsEqual();
        System.out.println("Output:\t" + distribute.makeEqual(new String[]{"abc", "aabc", "bc"}));
        System.out.println("Output:\t" + distribute.makeEqual(new String[]{"ab", "a"}));
    }

    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        int n = words.length;

        for (String word : words)
            for (char ch : word.toCharArray())
                count[ch - 'a']++;

        for (int c : count)
            if (c % n != 0) return false;

        return true;
    }
}
