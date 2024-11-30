//https://leetcode.com/problems/number-of-employees-who-met-the-target/
package algorithms.easy.n;

public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        NumberOfEmployeesWhoMetTheTarget target = new NumberOfEmployeesWhoMetTheTarget();
        System.out.println("Output:\t" + target.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2));
        System.out.println("Output:\t" + target.numberOfEmployeesWhoMetTarget(new int[]{5, 1, 4, 2, 2}, 6));
    }

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int answer = 0;
        for (int hour : hours)
            if (hour >= target) answer++;
        return answer;
    }
}
