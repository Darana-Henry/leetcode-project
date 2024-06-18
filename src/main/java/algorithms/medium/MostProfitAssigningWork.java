//https://leetcode.com/problems/most-profit-assigning-work/description/
package algorithms.medium;

public class MostProfitAssigningWork {
    public static void main(String[] args) {
        MostProfitAssigningWork maxProfits = new MostProfitAssigningWork();
        System.out.println(
                "Output:\t" + maxProfits.maxProfitAssignment(new int[]{2, 4, 6, 8, 10}, new int[]{10, 20, 30, 40, 50},
                        new int[]{4, 5, 6, 7}));
        System.out.println("Output:\t" + maxProfits.maxProfitAssignment(new int[]{85, 47, 57}, new int[]{24, 66, 99},
                new int[]{40, 25, 25}));
    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxDifficulty = 0;
        int totalProfit = 0;

        for (int d : difficulty)
            maxDifficulty = Math.max(maxDifficulty, d);

        int[] maxProfitUpToDifficulty = new int[maxDifficulty + 1];
        for (int i = 0; i < difficulty.length; i++)
            maxProfitUpToDifficulty[difficulty[i]] = Math.max(maxProfitUpToDifficulty[difficulty[i]], profit[i]);

        for (int i = 1; i <= maxDifficulty; i++)
            maxProfitUpToDifficulty[i] = Math.max(maxProfitUpToDifficulty[i], maxProfitUpToDifficulty[i - 1]);

        for (int ability : worker) {
            if (ability > maxDifficulty)
                totalProfit += maxProfitUpToDifficulty[maxDifficulty];
            else
                totalProfit += maxProfitUpToDifficulty[ability];
        }

        return totalProfit;
    }
}
