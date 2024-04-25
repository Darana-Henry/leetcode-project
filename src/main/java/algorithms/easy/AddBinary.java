package algorithms.easy;

public class AddBinary {

    public static void main(String[] args) {

        AddBinary addBinary = new AddBinary();

        String a = "11", b = "1";
        System.out.println("Output:\t" + addBinary.addBinary(a, b));

        a = "1010";
        b = "1011";
        System.out.println("Output:\t" + addBinary.addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum = sum + (a.charAt(i) - '0');
                i--;
            }

            if (j >= 0) {
                sum = sum + (b.charAt(j) - '0');
                j--;
            }

            stringBuilder.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            stringBuilder.append(carry);
        }

        return stringBuilder.reverse().toString();
    }
}
