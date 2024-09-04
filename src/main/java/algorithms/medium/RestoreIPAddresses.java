//https://leetcode.com/problems/restore-ip-addresses/
package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

    List<String> ips = new ArrayList<>();
    List<String> current = new ArrayList<>();
    String str;
    int len;

    public static void main(String[] args) {
        RestoreIPAddresses restore = new RestoreIPAddresses();
        System.out.println("Output:\t" + restore.restoreIpAddresses("25525511135"));
        System.out.println("Output:\t" + restore.restoreIpAddressesWithBackTracking("0000"));
        System.out.println("Output:\t" + restore.restoreIpAddressesWithBackTracking("101023"));
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> ips = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int aLen = 1; aLen <= 3; aLen++) {
            for (int bLen = 1; bLen <= 3; bLen++) {
                for (int cLen = 1; cLen <= 3; cLen++) {
                    int dLen = len - aLen - bLen - cLen;

                    if (dLen > 0 && dLen <= 3) {
                        int a = Integer.parseInt(s.substring(0, aLen));
                        int b = Integer.parseInt(s.substring(aLen, aLen + bLen));
                        int c = Integer.parseInt(s.substring(aLen + bLen, aLen + bLen + cLen));
                        int d = Integer.parseInt(s.substring(aLen + bLen + cLen));

                        if (a <= 255 && b <= 255 && c <= 255 && d <= 255)
                            sb.append(a).append(".").append(b).append(".").append(c).append(".").append(d);

                        if (sb.length() == len + 3)
                            ips.add(sb.toString());
                    }
                    sb.setLength(0);
                }
            }
        }
        return ips;
    }

    public List<String> restoreIpAddressesWithBackTracking(String s) {
        str = s;
        len = s.length();
        backtrack(0);
        return ips;
    }

    public void backtrack(int index) {
        if (index >= len && current.size() >= 4) {
            ips.add(String.join(".", current));
            return;
        }

        if (index >= len || current.size() >= 4)
            return;

        int num = 0;
        for (int i = index; i < Math.min(index + 3, len); i++) {
            num = num * 10 + str.charAt(i) - '0';
            if (num > 255 || (str.charAt(index) == '0' && index != i))
                break;

            current.add(str.substring(index, i + 1));
            backtrack(i + 1);
            current.remove(current.size() - 1);

        }

    }

}
