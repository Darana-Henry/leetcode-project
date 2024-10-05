//https://leetcode.com/problems/faulty-keyboard/
package algorithms.easy.f;

public class FaultyKeyboard {
    public static void main(String[] args) {
        FaultyKeyboard faulty = new FaultyKeyboard();
        System.out.println("Output:\t" + faulty.finalString("string"));
        System.out.println("Output:\t" + faulty.finalString("poiinter"));
    }

    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == 'i') sb.reverse();
            else sb.append(ch);
        }
        return sb.toString();
    }
}
