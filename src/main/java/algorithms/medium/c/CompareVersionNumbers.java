//https://leetcode.com/problems/compare-version-numbers/
package algorithms.medium.c;

public class CompareVersionNumbers {
    public static void main(String[] args) {
        CompareVersionNumbers obj = new CompareVersionNumbers();
        System.out.println("Output:\t" + obj.compareVersion("1.2", "1.10"));
        System.out.println("Output:\t" + obj.compareVersion("1.01", "1.001"));
        System.out.println("Output:\t" + obj.compareVersion("1.0", "1.0.0.0"));
    }

    public int compareVersion(String version1, String version2) {
        int v1 = version1.length(), v2 = version2.length();

        for (int i = 0, j = 0; (i < v1 || j < v2); i++, j++) {
            int nv1 = 0, nv2 = 0;

            while (i < v1 && version1.charAt(i) != '.') {
                nv1 = nv1 * 10 + (version1.charAt(i) - '0');
                i++;
            }

            while (j < v2 && version2.charAt(j) != '.') {
                nv2 = nv2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if (nv1 != nv2) return nv1 < nv2 ? -1 : 1;
        }

        return 0;
    }
}
