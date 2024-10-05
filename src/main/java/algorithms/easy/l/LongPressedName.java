//https://leetcode.com/problems/long-pressed-name/
package algorithms.easy.l;

public class LongPressedName {
    public static void main(String[] args) {
        LongPressedName longPressed = new LongPressedName();
        System.out.println("Output:\t" + longPressed.isLongPressedName("alex", "aaleex"));
        System.out.println("Output:\t" + longPressed.isLongPressedName("saeed", "ssaaedd"));
    }

    public boolean isLongPressedName(String name, String typed) {
        if (name.length() == typed.length() && name.equals(typed)) return true;
        if (name.length() > typed.length()) return false;
        int nPointer = 0;
        int tPointer = 0;

        while (tPointer < typed.length()) {
            if (nPointer < name.length() && name.charAt(nPointer) == typed.charAt(tPointer)) nPointer++;
            else if (tPointer == 0 || typed.charAt(tPointer) != typed.charAt(tPointer - 1)) return false;
            tPointer++;
        }
        return nPointer == name.length();
    }
}
