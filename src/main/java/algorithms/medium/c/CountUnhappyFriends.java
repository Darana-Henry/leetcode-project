//https://leetcode.com/problems/count-unhappy-friends/
package algorithms.medium.c;

public class CountUnhappyFriends {
    public static void main(String[] args) {
        CountUnhappyFriends obj = new CountUnhappyFriends();
        System.out.println("Output:\t" + obj.unhappyFriends(4, new int[][]{{1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}},
                new int[][]{{0, 1}, {2, 3}}));
        System.out.println("Output:\t" + obj.unhappyFriends(2, new int[][]{{1}, {0}}, new int[][]{{1, 0}}));
        System.out.println("Output:\t" + obj.unhappyFriends(4, new int[][]{{1, 3, 2}, {2, 3, 0}, {1, 3, 0}, {0, 2, 1}},
                new int[][]{{1, 3}, {0, 2}}));
    }

    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int answer = 0;
        int[][] pref = new int[n][n];
        int[] pairing = new int[n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - 1; j++)
                pref[i][preferences[i][j]] = j;

        for (int[] pair : pairs) {
            int f1 = pair[0], f2 = pair[1];
            pairing[f1] = f2;
            pairing[f2] = f1;
        }

        for (int fx = 0; fx < n; fx++) {
            int fy = pairing[fx];

            for (int i = 0; i < preferences[fx].length; i++) {
                int fo = preferences[fx][i];
                if (fo == fy) break;

                if (pref[fo][fx] < pref[fo][pairing[fo]]) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
