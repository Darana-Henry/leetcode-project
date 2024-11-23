//https://leetcode.com/problems/to-lower-case/
package algorithms.easy.t;

public class ToLowerCase {
    public static void main(String[] args) {
        ToLowerCase lower = new ToLowerCase();
        System.out.println("Output:\t" + lower.toLowerCase("Hello"));
        System.out.println("Output:\t" + lower.toLowerCase("here"));
        System.out.println("Output:\t" + lower.toLowerCase("LOVELY"));
    }

    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
