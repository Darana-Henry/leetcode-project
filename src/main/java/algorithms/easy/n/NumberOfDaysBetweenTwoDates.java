//https://leetcode.com/problems/number-of-days-between-two-dates/
package algorithms.easy.n;

public class NumberOfDaysBetweenTwoDates {
    public static void main(String[] args) {
        NumberOfDaysBetweenTwoDates diff = new NumberOfDaysBetweenTwoDates();
        System.out.println("Output:\t" + diff.daysBetweenDates("2019-06-29", "2019-06-30"));
        System.out.println("Output:\t" + diff.daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(calcDays(date1) - calcDays(date2));
    }

    public boolean isLeap(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public int daysInMonth(int year, int month) {
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        daysPerMonth[1] += isLeap(year) ? 1 : 0;
        return daysPerMonth[month - 1];
    }

    public int calcDays(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int days = 0;

        for (int i = 1971; i < year; ++i)
            days += isLeap(i) ? 366 : 365;

        for (int i = 1; i < month; i++)
            days += daysInMonth(year, i);

        return days + day;
    }
}
