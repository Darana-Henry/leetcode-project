//https://leetcode.com/problems/assign-cookies/
package algorithms.easy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        AssignCookies assignCookies = new AssignCookies();
        System.out.println("Output:\t" + assignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println("Output:\t" + assignCookies.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    public int findContentChildren(int[] g, int[] s) {
        int max = 0;
        int sp = s.length - 1;
        int gp = g.length - 1;

        Arrays.sort(g);
        Arrays.sort(s);

        while (sp >= 0 && gp >= 0) {
            if (s[sp] >= g[gp]) {
                max++;
                sp--;
                gp--;
            } else
                gp--;
        }

        return max;
    }
}
