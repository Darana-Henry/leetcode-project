//https://leetcode.com/problems/maximum-population-year/
package algorithms.easy.m;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        MaximumPopulationYear maxPop = new MaximumPopulationYear();
        System.out.println("Output:\t" + maxPop.maximumPopulation(new int[][]{{1993, 1999}, {2000, 2010}}));
        System.out.println(
                "Output:\t" + maxPop.maximumPopulation(new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}}));
    }

    public int maximumPopulation(int[][] logs) {
        int offset = 1950;
        int[] delta = new int[101];

        for (int[] log : logs) {
            delta[log[0] - offset]++;
            delta[log[1] - offset]--;
        }

        int maxPop = 0;
        int indexPop = 0;
        int totalPop = 0;

        for (int i = 0; i < delta.length; i++) {
            totalPop += delta[i];
            if (maxPop < totalPop) {
                maxPop = totalPop;
                indexPop = i;
            }

        }

        return indexPop + offset;

    }
}
