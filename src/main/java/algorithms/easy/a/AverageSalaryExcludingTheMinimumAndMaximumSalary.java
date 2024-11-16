//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
package algorithms.easy.a;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        AverageSalaryExcludingTheMinimumAndMaximumSalary avg = new AverageSalaryExcludingTheMinimumAndMaximumSalary();
        System.out.println("Output:\t" + avg.averageOptimized(new int[]{4000, 3000, 1000, 2000}));
        System.out.println("Output:\t" + avg.averageOptimized(new int[]{1000, 2000, 3000}));
        System.out.println("Output:\t" + avg.average(new int[]{4000, 3000, 1000, 2000}));
        System.out.println("Output:\t" + avg.average(new int[]{1000, 2000, 3000}));
    }

    public double averageOptimized(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n = salary.length, sum = 0;

        for (int sal : salary) {
            min = Math.min(min, sal);
            max = Math.max(max, sal);
            sum += sal;
        }

        sum -= (min + max);
        return (sum * 1.0) / (n - 2);
    }

    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        int sum = 0;

        for (int i = 1; i < n - 1; i++)
            sum += salary[i];

        return (double) sum / (n - 2);
    }
}
