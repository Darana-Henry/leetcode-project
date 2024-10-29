//https://leetcode.com/problems/course-schedule-ii/
package algorithms.medium.c;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CourseScheduleII {

    public static void main(String[] args) {
        CourseScheduleII schedule = new CourseScheduleII();
        System.out.println("Output:\t" + schedule.findOrder(2, new int[][]{{1, 0}}));
        System.out.println("Output:\t" + schedule.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
        System.out.println("Output:\t" + schedule.findOrder(1, new int[][]{}));
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new List[numCourses];
        int[] courses = new int[numCourses];
        int[] order = new int[numCourses];
        int courseCount = 0;

        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList<>();

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int pre = prerequisite[1];
            graph[pre].add(course);
            courses[course]++;
        }

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++)
            if (courses[i] == 0) dq.offer(i);

        while (!dq.isEmpty()) {
            int curr = dq.poll();
            order[courseCount] = curr;
            courseCount++;

            for (int adjacent : graph[curr]) {
                courses[adjacent]--;
                if (courses[adjacent] == 0) dq.offer(adjacent);
            }
        }

        return courseCount == numCourses ? order : new int[0];
    }
}
