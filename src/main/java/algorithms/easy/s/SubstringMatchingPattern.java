//https://leetcode.com/problems/substring-matching-pattern/
package algorithms.easy.s;

public class SubstringMatchingPattern {
    public static void main(String[] args) {
        SubstringMatchingPattern obj = new SubstringMatchingPattern();
        System.out.println("Output:\t" + obj.hasMatch("leetcode", "ee*e"));
        System.out.println("Output:\t" + obj.hasMatch("car", "c*v"));
        System.out.println("Output:\t" + obj.hasMatch("luck", "u*"));
    }


    public boolean hasMatch(String s, String p) {
        int index = p.indexOf('*');
        int first = s.indexOf(p.substring(0, index));
        int second = s.indexOf(p.substring(index + 1), first + index);
        return first != -1 && second != -1;
    }
}
