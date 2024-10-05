//https://leetcode.com/problems/count-of-matches-in-tournament/
package algorithms.easy.c;

public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        CountOfMatchesInTournament matches = new CountOfMatchesInTournament();
        System.out.println("Output:\t" + matches.numberOfMatches(7));
        System.out.println("Output:\t" + matches.numberOfMatches(14));
        System.out.println("Output:\t" + matches.numberOfMatchesOptimized(7));
        System.out.println("Output:\t" + matches.numberOfMatchesOptimized(14));
    }

    public int numberOfMatches(int n) {
        int games = 0;
        while (n > 1) {
            if (n % 2 == 1) {
                games += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            } else {
                games += n / 2;
                n /= 2;
            }

        }
        return games;
    }

    public int numberOfMatchesOptimized(int n) {
        return n - 1;
    }
}
