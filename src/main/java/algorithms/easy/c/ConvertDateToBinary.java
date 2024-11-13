//https://leetcode.com/problems/convert-date-to-binary/
package algorithms.easy.c;

public class ConvertDateToBinary {
    public static void main(String[] args) {
        ConvertDateToBinary binary = new ConvertDateToBinary();
        System.out.println("Output:\t" + binary.convertDateToBinary("2080-02-29"));
        System.out.println("Output:\t" + binary.convertDateToBinary("1900-01-01"));
    }


    public String convertDateToBinary(String date) {
        return base2(date.substring(0, 4)) + "-" + base2(date.substring(5, 7)) + "-" + base2(date.substring(8, 10));
    }

    public String base2(String s) {
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        for (char ch : s.toCharArray())
            temp = temp * 10 + (ch - '0');

        while (temp > 0) {
            sb.insert(0, (temp % 2 == 0) ? "0" : "1");
            temp /= 2;
        }
        return sb.toString();
    }
}
