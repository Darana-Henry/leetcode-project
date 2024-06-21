//https://leetcode.com/problems/asteroid-collision/description/
package algorithms.medium;

import java.util.Iterator;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        AsteroidCollision collision = new AsteroidCollision();
        System.out.println("Output:\t" + collision.asteroidCollision(new int[]{5, 10, -5}));
        System.out.println("Output:\t" + collision.asteroidCollision(new int[]{8, -8}));
        System.out.println("Output:\t" + collision.asteroidCollision(new int[]{10, 2, -5}));
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {

            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (true) {
                    int peek = stack.peek();

                    if (peek < 0) {
                        stack.push(asteroid);
                        break;
                    } else if (peek == -asteroid) {
                        stack.pop();
                        break;
                    } else if (peek > -asteroid) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroid);
                            break;
                        }
                    }
                }
            }
        }

        int i = 0;
        int[] result = new int[stack.size()];
        Iterator value = stack.iterator();

        while (value.hasNext())
            result[i++] = (int) value.next();

        return result;
    }
}
