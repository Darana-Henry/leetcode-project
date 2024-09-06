//https://leetcode.com/problems/course-schedule/
package algorithms.medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CourseSchedule {
    public static void main(String[] args) {
        CourseSchedule schedule = new CourseSchedule();
        System.out.println("Output:\t" + schedule.canFinish(2, new int[][]{{1, 0}}));
        System.out.println("Output:\t" + schedule.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return true;
        List<List<Integer>> graph = new ArrayList<>();
        int[] courses = new int[numCourses];
        Deque<Integer> dq = new LinkedList<>();
        int processed = 0;

        for (int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());

        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
            courses[pre[0]]++;
        }

        for (int i = 0; i < numCourses; i++) {
            if (courses[i] == 0) dq.offer(i);
        }

        while (!dq.isEmpty()) {
            int course = dq.poll();
            processed++;

            for (int neighbour : graph.get(course)) {
                courses[neighbour]--;
                if (courses[neighbour] == 0) dq.offer(neighbour);
            }
        }
        return processed == numCourses;
    }
}
