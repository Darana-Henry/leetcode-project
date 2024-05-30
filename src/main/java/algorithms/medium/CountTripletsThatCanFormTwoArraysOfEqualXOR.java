//https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/description/
package algorithms.medium;

import java.util.HashMap;

public class CountTripletsThatCanFormTwoArraysOfEqualXOR {

    public static void main(String[] args) {

        CountTripletsThatCanFormTwoArraysOfEqualXOR triplets = new CountTripletsThatCanFormTwoArraysOfEqualXOR();

        System.out.println("Output:\t" + triplets.countTriplets(new int[]{2, 3, 1, 6, 7}));
        System.out.println("Output:\t" + triplets.countTriplets(new int[]{1, 1, 1, 1, 1}));
    }

    public int countTriplets(int[] arr) {
        int total = 0, xor = 0;
        HashMap<Integer, Integer> frequency = new HashMap<>();
        HashMap<Integer, Integer> summation = new HashMap<>();
        frequency.put(0, 1);
        summation.put(0, 0);

        for (int i = 0; i < arr.length - 1; i++) {
            xor ^= arr[i];
            int key = xor ^ arr[i + 1];

            if (frequency.containsKey(key))
                total += frequency.get(key) * (i + 1) - summation.get(key);

            frequency.put(xor, frequency.getOrDefault(xor, 0) + 1);
            summation.put(xor, summation.getOrDefault(xor, 0) + (i + 1));
        }
        return total;
    }

    public int countTripletsBruteForce(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int xor = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (xor == arr[j])
                    total += j - i;
                xor ^= arr[j];
            }
        }
        return total;
    }
}
