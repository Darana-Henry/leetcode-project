//https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
package algorithms.easy.c;

public class CheckIfAllAsAppearsBeforeAllBs {
    public static void main(String[] args) {
        CheckIfAllAsAppearsBeforeAllBs ab = new CheckIfAllAsAppearsBeforeAllBs();
        System.out.println("Output:\t" + ab.checkString("aaabbb"));
        System.out.println("Output:\t" + ab.checkString("abab"));
        System.out.println("Output:\t" + ab.checkString("bbb"));
    }

    public boolean checkString(String s) {
        return !s.contains("ba");
    }
}
