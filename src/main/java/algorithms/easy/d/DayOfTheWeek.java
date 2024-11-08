//https://leetcode.com/problems/day-of-the-week/
package algorithms.easy.d;

public class DayOfTheWeek {
    public static void main(String[] args) {
        DayOfTheWeek days = new DayOfTheWeek();
        System.out.println("Output:\t" + days.dayOfTheWeek(31, 8, 2019));
        System.out.println("Output:\t" + days.dayOfTheWeek(18, 7, 1999));
        System.out.println("Output:\t" + days.dayOfTheWeek(15, 8, 1993));
    }

    public String dayOfTheWeek(int day, int month, int year) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = day;
        boolean isLeap = (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));

        for (int i = 1; i < month; i++)
            days += months[i];

        if (isLeap && month > 2) days++;

        year--;
        days += (year + (year / 4) - (year / 100) + (year / 400)) % 7;
        return weekdays[(days) % 7];
    }
}
