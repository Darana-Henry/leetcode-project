//https://leetcode.com/problems/sort-the-students-by-their-kth-score/
package algorithms.medium.s;

import java.util.Arrays;

public class SortTheStudentsByTheirKthScore {
    public static void main(String[] args) {
        SortTheStudentsByTheirKthScore obj = new SortTheStudentsByTheirKthScore();
        System.out.println(
                "Output:\t" + obj.sortTheStudents(new int[][]{{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}}, 2));
        System.out.println("Output:\t" + obj.sortTheStudents(new int[][]{{3, 4}, {5, 6}}, 0));
    }

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }
}
