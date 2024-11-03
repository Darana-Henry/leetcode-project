//https://leetcode.com/problems/day-of-the-year/
package algorithms.easy.d;

public class DayOfTheYear {
    public static void main(String[] args) {
        DayOfTheYear days = new DayOfTheYear();
        System.out.println("Output:\t" + days.dayOfYear("2019-01-09"));
        System.out.println("Output:\t" + days.dayOfYear("2019-02-10"));
    }

    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int days = Integer.parseInt(date.substring(8));
        int answer = days;

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        int feb = isLeap ? 29 : 28;
        int[] daysOfMonth = {31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month - 1; i++)
            answer += daysOfMonth[i];

        return answer;
    }
}
