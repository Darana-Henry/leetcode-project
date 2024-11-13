//https://leetcode.com/problems/find-the-key-of-the-numbers/
package algorithms.easy.f;

public class FindTheKeyOfTheNumbers {
    public static void main(String[] args) {
        FindTheKeyOfTheNumbers key = new FindTheKeyOfTheNumbers();
        System.out.println("Output:\t" + key.generateKey(1, 10, 1000));
        System.out.println("Output:\t" + key.generateKey(987, 879, 798));
        System.out.println("Output:\t" + key.generateKey(1, 2, 3));
    }

    public int generateKey(int num1, int num2, int num3) {
        StringBuilder s1 = new StringBuilder(String.format("%04d", num1));
        StringBuilder s2 = new StringBuilder(String.format("%04d", num2));
        StringBuilder s3 = new StringBuilder(String.format("%04d", num3));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int min = Math.min((s1.charAt(i) - '0'), Math.min((s2.charAt(i) - '0'), (s3.charAt(i) - '0')));
            sb.append(min);
        }

        return Integer.parseInt(sb.toString());
    }
}
