//https://leetcode.com/problems/latest-time-you-can-obtain-after-replacing-characters/
package algorithms.easy.l;

public class LatestTimeYouCanObtainAfterReplacingCharacters {
    public static void main(String[] args) {
        LatestTimeYouCanObtainAfterReplacingCharacters latest = new LatestTimeYouCanObtainAfterReplacingCharacters();
        System.out.println("Output:\t" + latest.findLatestTime("1?:?4"));
        System.out.println("Output:\t" + latest.findLatestTime("0?:5?"));
    }

    public String findLatestTime(String s) {
        char[] time = s.toCharArray();
        if (time[0] == '?') time[0] = (time[1] == '?' || time[1] < '2') ? '1' : '0';
        if (time[1] == '?') time[1] = (time[0] == '1') ? '1' : '9';
        if (time[3] == '?') time[3] = '5';
        if (time[4] == '?') time[4] = '9';
        return new String(time);
    }
}
