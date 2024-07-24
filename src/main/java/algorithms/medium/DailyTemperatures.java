package algorithms.medium;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        DailyTemperatures daily = new DailyTemperatures();
        System.out.println("Output:\t" + daily.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
        System.out.println("Output:\t" + daily.dailyTemperatures(new int[]{30, 40, 50, 60}));
        System.out.println("Output:\t" + daily.dailyTemperatures(new int[]{30, 60, 90}));
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? 0 : st.peek() - i;
            st.push(i);
        }
        return ans;
    }
}
