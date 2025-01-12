//https://leetcode.com/problems/repeated-dna-sequences/
package algorithms.medium.r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        RepeatedDNASequences obj = new RepeatedDNASequences();
        System.out.println("Output:\t" + obj.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        System.out.println("Output:\t" + obj.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
    }

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> answer = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length() - 9; i++) {
            String curr = s.substring(i, i + 10);
            if (!set.add(curr)) if (!answer.contains(curr)) answer.add(curr);
        }

        return answer;
    }
}
