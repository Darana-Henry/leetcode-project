//https://leetcode.com/problems/student-attendance-record-i/description/
package algorithms.easy;

public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        StudentAttendanceRecordI attendance = new StudentAttendanceRecordI();
        System.out.println("Output:\t" + attendance.checkRecord("PPALLP"));
        System.out.println("Output:\t" + attendance.checkRecord("PPALLL"));
    }

    public boolean checkRecord(String s) {
        int late = 0;
        int absent = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                absent++;
                late = 0;
            } else if (ch == 'L') late++;
            else late = 0;

            if (late >= 3 || absent >= 2) return false;
        }
        return true;
    }
}
