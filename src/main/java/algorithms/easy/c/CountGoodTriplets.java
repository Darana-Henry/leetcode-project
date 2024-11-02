//https://leetcode.com/problems/count-good-triplets/
package algorithms.easy.c;

public class CountGoodTriplets {
    public static void main(String[] args) {
        CountGoodTriplets triplets = new CountGoodTriplets();
        System.out.println("Output:\t" + triplets.countGoodTriplets(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3));
        System.out.println("Output:\t" + triplets.countGoodTriplets(new int[]{1, 1, 2, 2, 3}, 0, 0, 1));
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(
                            arr[i] - arr[k]) <= c) answer++;
                }
            }
        }
        return answer;
    }
}
