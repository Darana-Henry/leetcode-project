//https://leetcode.com/problems/check-if-the-number-is-fascinating/
package algorithms.easy.f;

public class FindTheMaximumAchievableNumber {
    public static void main(String[] args) {
        FindTheMaximumAchievableNumber achievable = new FindTheMaximumAchievableNumber();
        System.out.println("Output:\t" + achievable.theMaximumAchievableX(4, 1));
        System.out.println("Output:\t" + achievable.theMaximumAchievableX(3, 2));
    }

    public int theMaximumAchievableX(int num, int t) {
        return num + t * 2;
    }
}
