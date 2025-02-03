//https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/
package algorithms.medium.m;

public class MinimumAmountOfTimeToCollectGarbage {
    public static void main(String[] args) {
        MinimumAmountOfTimeToCollectGarbage obj = new MinimumAmountOfTimeToCollectGarbage();
        System.out.println("Output:\t" + obj.garbageCollection(new String[]{"G", "P", "GP", "GG"}, new int[]{2, 4, 3}));
        System.out.println("Output:\t" + obj.garbageCollection(new String[]{"MMM", "PGM", "GP"}, new int[]{3, 10}));
    }

    public int garbageCollection(String[] garbage, int[] travel) {
        int answer = 0;
        int[] prefix = new int[travel.length + 1];
        int[] last = new int[26];

        prefix[0] = 0;
        for (int i = 0; i < travel.length; i++)
            prefix[i + 1] = prefix[i] + travel[i];

        for (int i = 0; i < garbage.length; i++) {
            for (char ch : garbage[i].toCharArray()) {
                last[ch - 'A'] = i;
            }
        }

        for (String g : garbage)
            answer += g.length();

        for (int c : last)
            if (c > 0) answer += prefix[c];

        return answer;
    }
}
