//https://leetcode.com/problems/find-the-encrypted-string/
package algorithms.easy.f;

public class FindTheEncryptedString {
    public static void main(String[] args) {
        FindTheEncryptedString encrypt = new FindTheEncryptedString();
        System.out.println("Output:\t" + encrypt.getEncryptedString("dart", 3));
        System.out.println("Output:\t" + encrypt.getEncryptedString("aaa", 1));
    }

    public String getEncryptedString(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(s.charAt((i + k) % n));
        return sb.toString();
    }
}
