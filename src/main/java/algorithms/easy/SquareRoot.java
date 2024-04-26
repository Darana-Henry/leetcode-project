package algorithms.easy;

public class SquareRoot {

    public static void main(String[] args) {

        SquareRoot squareRoot = new SquareRoot();

        System.out.println("Output:\t" + squareRoot.mySqrt(4));
        System.out.println("Output:\t" + squareRoot.mySqrt(8));
        System.out.println("Output:\t" + squareRoot.mySqrt(9));
        System.out.println("Output:\t" + squareRoot.mySqrt(17));
        System.out.println("Output:\t" + squareRoot.mySqrt(2147395599));
    }

    public int mySqrt(int x) {
        long left = 0;
        long right = x;

        while (left < right) {
            long mid = left + (right - left) / 2 + 1;
            long square = mid * mid;
            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return (int) left;
    }
}
