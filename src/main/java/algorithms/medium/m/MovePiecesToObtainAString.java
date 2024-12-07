//https://leetcode.com/problems/move-pieces-to-obtain-a-string/
package algorithms.medium.m;

import java.util.ArrayList;
import java.util.List;

public class MovePiecesToObtainAString {
    public static void main(String[] args) {
        MovePiecesToObtainAString movePiecesToObtainAString = new MovePiecesToObtainAString();
        System.out.println("Output:\t" + movePiecesToObtainAString.canChange("_L__R__R_", "______RR"));
        System.out.println("Output:\t" + movePiecesToObtainAString.canChange("R_L_", "__LR"));
        System.out.println("Output:\t" + movePiecesToObtainAString.canChange("_R", "R_"));
    }

    public boolean canChange(String start, String target) {
        List<int[]> sta = parse(start);
        List<int[]> tar = parse(target);
        if (sta.size() != tar.size()) return false;

        for (int i = 0; i < sta.size(); i++) {
            int[] s = sta.get(i);
            int[] t = tar.get(i);
            if (s[0] != t[0]) return false;
            if (s[0] == 1 && s[1] < t[1]) return false;
            if (s[0] == 2 && s[1] > t[1]) return false;
        }

        return true;
    }

    public List<int[]> parse(String str) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'L') list.add(new int[]{1, i});
            else if (ch == 'R') list.add(new int[]{2, i});
        }
        return list;
    }
}
