//https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition/
package algorithms.easy.m;

public class MinimumHoursOfTrainingToWinACompetition {
    public static void main(String[] args) {
        MinimumHoursOfTrainingToWinACompetition hours = new MinimumHoursOfTrainingToWinACompetition();
        System.out.println("Output:\t" + hours.minNumberOfHours(5, 3, new int[]{1, 4, 3, 2}, new int[]{2, 6, 3, 1}));
        System.out.println("Output:\t" + hours.minNumberOfHours(2, 4, new int[]{1}, new int[]{3}));
    }

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int answer = 0;

        for (int i = 0; i < energy.length; i++) {
            int en = energy[i];
            int exp = experience[i];

            if (en >= initialEnergy) {
                answer += en - initialEnergy + 1;
                initialEnergy = en + 1;
            }

            if (exp >= initialExperience) {
                answer += exp - initialExperience + 1;
                initialExperience = exp + 1;
            }

            initialEnergy -= en;
            initialExperience += exp;
        }

        return answer;
    }
}
