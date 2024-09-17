//https://leetcode.com/problems/word-ladder/
package algorithms.hard;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        WordLadder wordLadder = new WordLadder();
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        System.out.println("Output:\t" + wordLadder.ladderLength("hit", "cog", wordList));
        wordList.add("cog");
        System.out.println("Output:\t" + wordLadder.ladderLength("hit", "cog", wordList));
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>();
        for (String string : wordList)
            set.add(string);

        if (!set.contains(endWord)) return 0;
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int level = 1;

        while (!q.isEmpty()) {
            int currSize = q.size();

            for (int i = 0; i < currSize; i++) {
                String currWord = q.poll();
                char[] chars = currWord.toCharArray();

                for (int j = 0; j < chars.length; j++) {
                    char original = chars[j];

                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (chars[j] == ch) continue;

                        chars[j] = ch;
                        String newWord = String.valueOf(chars);

                        if (newWord.equals(endWord)) return level + 1;

                        if (set.contains(newWord)) {
                            q.offer(newWord);
                            set.remove(newWord);
                        }
                    }
                    chars[j] = original;
                }
            }
            level++;
        }
        return 0;
    }

    public int ladderLengthBiDirectional(String beginWord, String endWord, Set<String> wordList) {
        Set<String> beginSet = new HashSet<String>(), endSet = new HashSet<String>();
        int len = 1;
        int strLen = beginWord.length();
        HashSet<String> visited = new HashSet<String>();
        beginSet.add(beginWord);
        endSet.add(endWord);

        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            if (beginSet.size() > endSet.size()) {
                Set<String> set = beginSet;
                beginSet = endSet;
                endSet = set;
            }

            Set<String> temp = new HashSet<String>();
            for (String word : beginSet) {
                char[] chs = word.toCharArray();

                for (int i = 0; i < chs.length; i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        char old = chs[i];
                        chs[i] = c;
                        String target = String.valueOf(chs);

                        if (endSet.contains(target)) {
                            return len + 1;
                        }

                        if (!visited.contains(target) && wordList.contains(target)) {
                            temp.add(target);
                            visited.add(target);
                        }
                        chs[i] = old;
                    }
                }
            }

            beginSet = temp;
            len++;
        }

        return 0;
    }
}
