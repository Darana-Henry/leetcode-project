//https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/
package algorithms.medium.f;

public class FindTheStudentThatWillReplaceTheChalk {
    public static void main(String[] args) {
        FindTheStudentThatWillReplaceTheChalk chalk = new FindTheStudentThatWillReplaceTheChalk();
        System.out.println("Output:\t" + chalk.chalkReplacer(new int[]{5, 1, 5}, 22));
        System.out.println("Output:\t" + chalk.chalkReplacer(new int[]{3, 4, 1, 2}, 25));
    }

    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int c : chalk)
            sum += c;

        int remainder = (int) (k % sum);
        for (int i = 0; i < chalk.length; i++) {
            if (remainder < chalk[i]) return i;
            remainder -= chalk[i];
        }
        return -1;
    }
}
