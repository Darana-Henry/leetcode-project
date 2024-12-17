//https://leetcode.com/problems/solve-the-equation/
package algorithms.medium.s;

public class SolveTheEquation {
    public static void main(String[] args) {
        SolveTheEquation obj = new SolveTheEquation();
        System.out.println("Output:\t" + obj.solveEquation("x+5-3+x=6+x-2"));
        System.out.println("Output:\t" + obj.solveEquation("x=x"));
        System.out.println("Output:\t" + obj.solveEquation("2x=x"));
    }

    public String solveEquation(String equation) {
        String[] parts = equation.split("=");
        int[] left = parse(parts[0]);
        int[] right = parse(parts[1]);

        int leftX = left[0];
        int leftC = left[1];
        int rightX = right[0];
        int rightC = right[1];

        if (leftX == rightX) return leftC == rightC ? "Infinite solutions" : "No solution";
        return "x=" + (rightC - leftC) / (leftX - rightX);
    }

    public int[] parse(String str) {
        int coeff = 0;
        int cons = 0;

        if (str.charAt(0) != '-') str = "+" + str;

        int i = 0;
        int n = str.length();

        while (i < n) {
            int sign = str.charAt(i) == '+' ? 1 : -1;
            i++;
            int num = i;

            while (i < n && str.charAt(i) != '+' && str.charAt(i) != '-') {
                i++;
            }

            String val = str.substring(num, i);
            if (str.charAt(i - 1) == 'x')
                coeff += sign * (val.length() > 1 ? Integer.parseInt(val.substring(0, val.length() - 1)) : 1);
            else cons += sign * Integer.parseInt(val);

        }

        return new int[]{coeff, cons};
    }
}
