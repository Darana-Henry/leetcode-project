//https://leetcode.com/problems/partition-labels/
package algorithms.medium.p;

import java.util.List;
import java.util.ArrayList;

public class PartitionLabels {
    public static void main(String[] args) {
        PartitionLabels partition = new PartitionLabels();
        System.out.println("Output:\t" + partition.partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println("Output:\t" + partition.partitionLabels("eccbbbbdec"));
    }

    public List<Integer> partitionLabels(String s) {
        int currentMax = 0;
        int n = s.length();
        int partitionStart = 0;
        int[] counts = new int[26];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++)
            counts[s.charAt(i) - 'a'] = i;

        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax, counts[s.charAt(i) - 'a']);

            if (currentMax == i) {
                answer.add(i - partitionStart + 1);
                partitionStart = i + 1;
            }
        }

        return answer;
    }
}
