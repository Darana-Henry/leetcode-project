package algorithms.easy.p;

public class PlusOne {

    public static void main(String[] args) {

        PlusOne plusOneObj = new PlusOne();

        int[] digits = new int[]{4, 3, 2, 1};
        System.out.println("Output:\t" + plusOneObj.plusOne(digits));

        int[] digits2 = new int[]{9};
        System.out.println("Output:\t" + plusOneObj.plusOne(digits2));
    }

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] digitUpdated = new int[digits.length + 1];
        digitUpdated[0] = 1;
        return digitUpdated;
    }
}
