//https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
package algorithms.easy.n;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public static void main(String[] args) {
        NumberOfStudentsDoingHomeworkAtAGivenTime students = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        System.out.println("Output:\t" + students.busyStudent(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4));
        System.out.println("Output:\t" + students.busyStudent(new int[]{4}, new int[]{4}, 4));
    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int answer = 0;
        for (int i = 0; i < startTime.length; i++)
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) answer++;
        return answer;
    }
}
