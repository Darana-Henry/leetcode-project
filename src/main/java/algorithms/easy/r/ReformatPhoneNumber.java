//https://leetcode.com/problems/reformat-phone-number/
package algorithms.easy.r;

import java.util.ArrayList;
import java.util.List;

public class ReformatPhoneNumber {
    public static void main(String[] args) {
        ReformatPhoneNumber reformat = new ReformatPhoneNumber();
        System.out.println("Output:\t" + reformat.reformatNumber("1-23-45 6"));
        System.out.println("Output:\t" + reformat.reformatNumber("123 4-567"));
        System.out.println("Output:\t" + reformat.reformatNumber("123 4-5678"));
    }

    public String reformatNumber(String number) {
        number = number.replace(" ", "").replace("-", "");
        int n = number.length();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n / 3; i++)
            list.add(number.substring(i * 3, i * 3 + 3));

        int remainder = n % 3;

        if (remainder == 2) list.add(number.substring(n - 2));
        else if (remainder == 1) {
            int block = list.size() - 1;
            String part = list.remove(block).substring(0, 2);
            list.add(part);
            list.add(number.substring(n - 2));
        }

        return String.join("-", list);

    }
}
