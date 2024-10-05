//https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/
package algorithms.easy.m;

public class MaximumEnemyFortsThatCanBeCaptured {
    public static void main(String[] args) {
        MaximumEnemyFortsThatCanBeCaptured forts = new MaximumEnemyFortsThatCanBeCaptured();
        System.out.println("Output:\t" + forts.captureForts(new int[]{1, 0, 0, -1, 0, 0, 0, 0, 1}));
        System.out.println("Output:\t" + forts.captureForts(new int[]{0, 0, 1, -1}));
    }

    public int captureForts(int[] forts) {
        int answer = 0;
        for (int mine = 0, enemy = 0; mine < forts.length; mine++) {
            if (forts[mine] != 0) {
                if (forts[mine] == -forts[enemy]) answer = Math.max(answer, mine - enemy - 1);
                enemy = mine;
            }
        }
        return answer;
    }
}
