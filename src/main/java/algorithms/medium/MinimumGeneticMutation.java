//https://leetcode.com/problems/minimum-genetic-mutation/
package algorithms.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class MinimumGeneticMutation {
    public static void main(String[] args) {
        MinimumGeneticMutation mutation = new MinimumGeneticMutation();
        System.out.println("Output:\t" + mutation.minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}));
        System.out.println("Output:\t" + mutation.minMutation("AACCGGTT", "AAACGGTA",
                new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
    }

    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> set = new HashSet<>(Arrays.asList(bank));
        if (!set.contains(endGene)) return -1;

        Map<Character, String> map = new HashMap<>();
        map.put('A', "TCG");
        map.put('T', "ACG");
        map.put('C', "ATG");
        map.put('G', "ATC");

        Queue<String> q = new LinkedList<>();
        Queue<Integer> steps = new LinkedList<>();
        q.offer(startGene);
        steps.offer(0);

        while (!q.isEmpty()) {
            String currGene = q.poll();
            int currStep = steps.poll();

            if (currGene.equals(endGene)) return currStep;

            for (int i = 0; i < currGene.length(); i++) {
                char currChar = currGene.charAt(i);
                for (char mutation : map.get(currChar).toCharArray()) {
                    String mutatedGene = currGene.substring(0, i) + mutation + currGene.substring(i + 1);
                    if (set.contains(mutatedGene)) {
                        q.offer(mutatedGene);
                        steps.offer(currStep + 1);
                        set.remove(mutatedGene);
                    }
                }
            }
        }
        return -1;
    }
}
