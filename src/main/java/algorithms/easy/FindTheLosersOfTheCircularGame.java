//https://leetcode.com/problems/find-the-losers-of-the-circular-game/
package algorithms.easy;

public class FindTheLosersOfTheCircularGame {
    public static void main(String[] args) {
        FindTheLosersOfTheCircularGame losers = new FindTheLosersOfTheCircularGame();
        System.out.println("Output:\t" + losers.circularGameLosers(5, 2));
        System.out.println("Output:\t" + losers.circularGameLosers(4, 4));
    }

    public int[] circularGameLosers(int n, int k) {
        boolean[] visited = new boolean[n];
        int count = 0;
        int i = 0;
        while (!visited[i % n]) {
            count++;
            visited[i % n] = true;
            i += count * k;
        }
        int[] missed = new int[n - count];
        int j = 0;
        for (int p = 0; p < visited.length; p++) {
            if (!visited[p]) missed[j++] = p + 1;
        }
        return missed;
    }
}
