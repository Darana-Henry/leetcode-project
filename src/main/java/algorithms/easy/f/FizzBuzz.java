//https://leetcode.com/problems/fizz-buzz/description/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println("Output:\t" + fizzBuzz.fizzBuzz(3));
        System.out.println("Output:\t" + fizzBuzz.fizzBuzz(5));
        System.out.println("Output:\t" + fizzBuzz.fizzBuzz(15));
    }

    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) list.add("FizzBuzz");
            else if (i % 5 == 0) list.add("Buzz");
            else if (i % 3 == 0) list.add("Fizz");
            else list.add(i + "");
        }
        return list;
    }
}

