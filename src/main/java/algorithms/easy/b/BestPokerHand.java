//https://leetcode.com/problems/best-poker-hand/
package algorithms.easy.b;

public class BestPokerHand {
    public static void main(String[] args) {
        BestPokerHand poker = new BestPokerHand();
        System.out.println(
                "Output:\t" + poker.bestHand(new int[]{13, 2, 3, 1, 9}, new char[]{'a', 'a', 'a', 'a', 'a'}));
        System.out.println("Output:\t" + poker.bestHand(new int[]{4, 4, 2, 4, 4}, new char[]{'d', 'a', 'a', 'b', 'c'}));
        System.out.println(
                "Output:\t" + poker.bestHand(new int[]{10, 10, 2, 12, 9}, new char[]{'a', 'b', 'c', 'a', 'd'}));
    }

    public String bestHand(int[] ranks, char[] suits) {
        boolean flush = true;

        for (int i = 1; i < 5; i++)
            if (suits[i] != suits[i - 1]) {
                flush = false;
                break;
            }

        if (flush) return "Flush";
        int[] rankC = new int[14];
        boolean hasPair = false;

        for (int rank : ranks) {
            rankC[rank]++;
            if (rankC[rank] == 3) return "Three of a Kind";
            if (rankC[rank] == 2) hasPair = true;
        }

        return hasPair ? "Pair" : "High Card";
    }
}
