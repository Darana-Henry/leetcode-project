//https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/
package algorithms.easy.l;

public class LatestTimeByReplacingHiddenDigits {
    public static void main(String[] args) {
        LatestTimeByReplacingHiddenDigits hidden = new LatestTimeByReplacingHiddenDigits();
        System.out.println("Output:\t" + hidden.maximumTime("2?:?0"));
        System.out.println("Output:\t" + hidden.maximumTime("0?:3?"));
        System.out.println("Output:\t" + hidden.maximumTime("1?:22"));
    }

    public String maximumTime(String time) {
        char[] ch = time.toCharArray();
        if (ch[0] == '?') ch[0] = (ch[1] >= '4' && ch[1] <= '9') ? '1' : '2';
        if (ch[1] == '?') ch[1] = (ch[0] == '2') ? '3' : '9';
        if (ch[3] == '?') ch[3] = '5';
        if (ch[4] == '?') ch[4] = '9';
        return new String(ch);
    }
}
