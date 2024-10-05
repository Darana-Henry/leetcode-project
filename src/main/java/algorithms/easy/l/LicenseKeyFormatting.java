//https://leetcode.com/problems/license-key-formatting/
package algorithms.easy.l;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        LicenseKeyFormatting key = new LicenseKeyFormatting();
        System.out.println("Output:\t" + key.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println("Output:\t" + key.licenseKeyFormattingOptimized("2-5g-3-J", 2));
    }

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        s = s.toUpperCase();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != '-') {
                if (count == k) {
                    count = 0;
                    sb.append('-');
                }
                sb.append(ch);
                count++;
            }
        }
        return sb.reverse().toString();
    }

    public String licenseKeyFormattingOptimized(String s, int k) {
        s = s.toUpperCase().replaceAll("-", "");
        StringBuilder sb = new StringBuilder(s);

        for (int i = s.length() - k; i > 0; i = i - k)
            sb.insert(i, "-");

        return sb.toString();
    }
}
