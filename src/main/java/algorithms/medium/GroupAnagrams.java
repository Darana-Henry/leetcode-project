//https://leetcode.com/problems/group-anagrams/
package algorithms.medium;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams group = new GroupAnagrams();
        System.out.println(
                "Output:\t" + group.groupAnagramsViaMap(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println("Output:\t" + group.groupAnagramsViaFrequency(new String[]{""}));
        System.out.println("Output:\t" + group.groupAnagramsViaFrequency(new String[]{"a"}));
    }

    public List<List<String>> groupAnagramsViaMap(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            answer.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(answer.values());
    }

    public List<List<String>> groupAnagramsViaFrequency(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();

        for (String str : strs) {
            String mapped = frequencyMapped(str);
            answer.computeIfAbsent(mapped, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(answer.values());
    }

    public String frequencyMapped(String str) {
        StringBuilder sb = new StringBuilder();
        int[] frequency = new int[26];

        for (char ch : str.toCharArray())
            frequency[ch - 'a']++;

        char ch = 'a';
        for (int freq : frequency) {
            sb.append(ch++);
            sb.append(freq);
        }
        return sb.toString();
    }
}
