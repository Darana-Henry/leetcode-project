//https://leetcode.com/problems/determine-if-two-events-have-conflict/
package algorithms.easy.d;

public class DetermineIfTwoEventsHaveConflict {
    public static void main(String[] args) {
        DetermineIfTwoEventsHaveConflict conflict = new DetermineIfTwoEventsHaveConflict();
        System.out.println(
                "Output:\t" + conflict.haveConflict(new String[]{"01:15", "02:00"}, new String[]{"02:00", "03:00"}));
        System.out.println(
                "Output:\t" + conflict.haveConflict(new String[]{"01:00", "02:00"}, new String[]{"01:20", "03:00"}));
        System.out.println(
                "Output:\t" + conflict.haveConflict(new String[]{"10:00", "11:00"}, new String[]{"14:00", "15:00"}));
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        boolean a = event1[1].compareTo(event2[0]) < 0;
        boolean b = event1[0].compareTo(event2[1]) > 0;
        return !a && !b;
    }
}
