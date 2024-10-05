package algorithms.easy.h;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();

        System.out.println("Output:\t" + happyNumber.isHappy(19));
        System.out.println("Output:\t" + happyNumber.isHappy(2));
    }

    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                sum += (current % 10) * (current % 10);
                current /= 10;
            }
            if (seen.contains(sum))
                return false;
            else
                seen.add(sum);
            n = sum;
        }
        return true;
    }
}
