//https://leetcode.com/problems/dota2-senate/description/?envType=study-plan-v2&envId=leetcode-75
package algorithms.medium.d;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static void main(String[] args) {
        Dota2Senate d2s = new Dota2Senate();
        System.out.println("Output:\t" + d2s.predictPartyVictory("RD"));
        System.out.println("Output:\t" + d2s.predictPartyVictory("RDD"));
    }

    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R')
                radiant.add(i);
            else
                dire.add(i);
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();

            if (r < d)
                radiant.add(r + senate.length());
            else
                dire.add(d + senate.length());
        }
        return radiant.size() > dire.size() ? "Radiant" : "Dire";
    }
}
