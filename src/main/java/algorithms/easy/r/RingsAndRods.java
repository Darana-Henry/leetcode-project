//https://leetcode.com/problems/rings-and-rods/
package algorithms.easy.r;

import java.util.HashSet;
import java.util.Set;

public class RingsAndRods {
    public static void main(String[] args) {
        RingsAndRods and = new RingsAndRods();
        System.out.println("Output:\t" + and.countPoints("B0B6G0R6R0R6G9"));
        System.out.println("Output:\t" + and.countPoints("B0R0G0R9R0B0G0"));
        System.out.println("Output:\t" + and.countPoints("G4"));
    }

    public int countPoints(String rings) {
        int answer = 0;
        Set<Integer> r = new HashSet<>();
        Set<Integer> g = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        for (int i = 0; i < rings.length(); i += 2) {
            if (rings.charAt(i) == 'R') r.add(rings.charAt(i + 1) - '0');
            else if (rings.charAt(i) == 'G') g.add(rings.charAt(i + 1) - '0');
            else b.add(rings.charAt(i + 1) - '0');
        }

        for (int i = 0; i <= 9; i++)
            if (r.contains(i) && g.contains(i) && b.contains(i)) answer++;

        return answer;
    }
}
