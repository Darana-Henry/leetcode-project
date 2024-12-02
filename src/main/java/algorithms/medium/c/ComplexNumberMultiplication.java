//https://leetcode.com/problems/complex-number-multiplication/
package algorithms.medium.c;

public class ComplexNumberMultiplication {
    public static void main(String[] args) {
        ComplexNumberMultiplication complexNumberMultiplication = new ComplexNumberMultiplication();
        System.out.println("Output:\t" + complexNumberMultiplication.complexNumberMultiply("1+1i", "1+1i"));
        System.out.println("Output:\t" + complexNumberMultiplication.complexNumberMultiply("1+-1i", "1+-1i"));
    }

    public String complexNumberMultiply(String num1, String num2) {
        String[] parts1 = num1.split("\\+|i");
        String[] parts2 = num2.split("\\+|i");

        int real1 = Integer.parseInt(parts1[0]);
        int img1 = Integer.parseInt(parts1[1]);
        int real2 = Integer.parseInt(parts2[0]);
        int img2 = Integer.parseInt(parts2[1]);

        int real = real1 * real2 - img1 * img2;
        int img = img1 * real2 + img2 * real1;

        return String.format("%d+%di", real, img);
    }
}
