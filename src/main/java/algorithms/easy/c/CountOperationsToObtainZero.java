//https://leetcode.com/problems/count-operations-to-obtain-zero/
package algorithms.easy.c;

public class CountOperationsToObtainZero {
    public static void main(String[] args) {
        CountOperationsToObtainZero count = new CountOperationsToObtainZero();
        System.out.println("Output:\t" + count.countOperations(2, 3));
        System.out.println("Output:\t" + count.countOperations(10, 10));
    }

    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 < num2) num2 -= num1;
            else num1 -= num2;
            count++;
        }
        return count;
    }
}
