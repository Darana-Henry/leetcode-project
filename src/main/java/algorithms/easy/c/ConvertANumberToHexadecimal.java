//https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/
package algorithms.easy.c;

public class ConvertANumberToHexadecimal {
    public static void main(String[] args) {
        ConvertANumberToHexadecimal convert = new ConvertANumberToHexadecimal();
        System.out.println("Output:\t" + convert.toHex(26));
        System.out.println("Output:\t" + convert.toHex(-1));
    }

    public String toHex(int num) {
        if (num == 0)
            return "0";
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(map[num & 15]);
            num = num >>> 4;
        }
        return sb.reverse().toString();
    }
}
