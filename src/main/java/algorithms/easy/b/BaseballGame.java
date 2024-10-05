//https://leetcode.com/problems/baseball-game/
package algorithms.easy.b;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();
        System.out.println("Output:\t" + game.calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println("Output:\t" + game.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        System.out.println("Output:\t" + game.calPoints(new String[]{"1", "C"}));
        System.out.println("Output:\t" + game.calPointsFaster(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println("Output:\t" + game.calPointsFaster(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        System.out.println("Output:\t" + game.calPointsFaster(new String[]{"1", "C"}));
    }

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (!op.equals("C") && !op.equals("D") && !op.equals("+")) stack.push(Integer.valueOf(op));
            else {
                if (op.equals("C")) stack.pop();
                else if (op.equals("D")) stack.push(2 * stack.peek());
                else if (op.equals("+")) {
                    int prev = stack.pop();
                    int sum = stack.peek() + prev;
                    stack.push(prev);
                    stack.push(sum);
                }
            }
        }

        int sum = 0;
        for (int score : stack)
            sum += score;

        return sum;
    }

    public int calPointsFaster(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "+":
                    int last = stack.pop();
                    int newTop = stack.peek();
                    stack.push(last);
                    stack.push(last + newTop);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }

        int sum = 0;
        for (int score : stack)
            sum += score;

        return sum;
    }
}
