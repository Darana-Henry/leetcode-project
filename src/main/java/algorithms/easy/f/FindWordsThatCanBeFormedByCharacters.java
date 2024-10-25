//https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
package algorithms.easy.f;

public class FindWordsThatCanBeFormedByCharacters {
    public static void main(String[] args) {
        FindWordsThatCanBeFormedByCharacters formed = new FindWordsThatCanBeFormedByCharacters();
        System.out.println("Output:\t" + formed.countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
        System.out.println(
                "Output:\t" + formed.countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
    }

    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];

        for (char ch : chars.toCharArray())
            freq[ch - 'a']++;

        int answer = 0;
        for (String word : words) {
            int[] currFreq = new int[26];
            boolean canForm = true;

            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';

                if (++currFreq[index] > freq[index]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) answer += word.length();
        }

        return answer;
    }
}
