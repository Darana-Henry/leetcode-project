//https://leetcode.com/problems/add-two-integers/
package algorithms.easy.a;

public class AddTwoIntegers {
    public static void main(String[] args) {
        AddTwoIntegers add = new AddTwoIntegers();
        System.out.println("Output:\t" + add.sum(12, 5));
        System.out.println("Output:\t" + add.sum(-10, 4));
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
