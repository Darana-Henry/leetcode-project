//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
package algorithms.easy.n;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {
    public static void main(String[] args) {
        NumberOfStudentsUnableToEatLunch hungry = new NumberOfStudentsUnableToEatLunch();
        System.out.println("Output:\t" + hungry.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
        System.out.println(
                "Output:\t" + hungry.countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}));
        System.out.println("Output:\t" + hungry.countStudentsOptimized(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
        System.out.println(
                "Output:\t" + hungry.countStudentsOptimized(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}));

    }

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int student : students)
            q.add(student);

        Stack<Integer> stack = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--)
            stack.push(sandwiches[i]);

        int noChangeCount = 0;
        while (!stack.isEmpty() && noChangeCount < q.size()) {
            if (stack.peek() == q.peek()) {
                stack.pop();
                q.poll();
                noChangeCount = 0;
            } else {
                q.add(q.poll());
                noChangeCount++;
            }
        }
        return q.size();
    }

    public int countStudentsOptimized(int[] students, int[] sandwiches) {
        int[] count = new int[2];

        for (int student : students)
            count[student]++;

        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) return count[sandwich ^ 1];
            count[sandwich]--;
        }
        return 0;
    }
}
