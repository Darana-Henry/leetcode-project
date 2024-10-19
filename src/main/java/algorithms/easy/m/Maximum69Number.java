//https://leetcode.com/problems/maximum-69-number/
package algorithms.easy.m;

public class Maximum69Number {
    public static void main(String[] args) {
        Maximum69Number max69 = new Maximum69Number();
        System.out.println("Output:\t" + max69.maximum69Number(9669));
        System.out.println("Output:\t" + max69.maximum69Number(9996));
        System.out.println("Output:\t" + max69.maximum69Number(9999));
    }

    public int maximum69Number(int num) {
        String s = String.valueOf(num);
        return Integer.valueOf(s.replaceFirst("6", "9"));
    }
}
