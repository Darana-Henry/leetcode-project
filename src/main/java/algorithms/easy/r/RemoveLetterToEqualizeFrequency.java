//https://leetcode.com/problems/remove-letter-to-equalize-frequency/
package algorithms.easy.r;

public class RemoveLetterToEqualizeFrequency {
    public static void main(String[] args) {
        RemoveLetterToEqualizeFrequency remove = new RemoveLetterToEqualizeFrequency();
        System.out.println("Output:\t" + remove.equalFrequency("abcc"));
        System.out.println("Output:\t" + remove.equalFrequency("aazz"));
    }

    public boolean equalFrequency(String word) {
        int[] count = new int[26];

        for (char ch : word.toCharArray())
            count[ch - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                count[i]--;

                int target = 0;
                boolean isValid = true;

                for (int c : count) {
                    if (c == 0) continue;

                    if (target > 0 && c != target) {
                        isValid = false;
                        break;
                    }
                    target = c;
                }
                if (isValid) return true;
                count[i]++;
            }
        }

        return false;
    }
}
