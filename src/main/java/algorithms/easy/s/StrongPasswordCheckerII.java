//https://leetcode.com/problems/strong-password-checker-ii/
package algorithms.easy.s;

public class StrongPasswordCheckerII {
    public static void main(String[] args) {
        StrongPasswordCheckerII password = new StrongPasswordCheckerII();
        System.out.println("Output:\t" + password.strongPasswordCheckerII("IloveLe3tcode"));
        System.out.println("Output:\t" + password.strongPasswordCheckerII("Me+You--IsMyDream"));
        System.out.println("Output:\t" + password.strongPasswordCheckerII("1aB!"));
    }

    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;
        int mask = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (i > 0 && password.charAt(i - 1) == ch) return false;
            if (Character.isLowerCase(ch)) mask |= 1;
            else if (Character.isUpperCase(ch)) mask |= 2;
            else if (Character.isDigit(ch)) mask |= 4;
            else mask |= 8;
        }
        return mask == 15;
    }
}
