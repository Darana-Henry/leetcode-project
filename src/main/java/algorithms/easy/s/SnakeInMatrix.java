//https://leetcode.com/problems/snake-in-matrix/
package algorithms.easy.s;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SnakeInMatrix {
    public static void main(String[] args) {
        SnakeInMatrix snake = new SnakeInMatrix();
        System.out.println(
                "Output:\t" + snake.finalPositionOfSnake(2, new ArrayList<>(Arrays.asList("RIGHT", "DOWN"))));
        System.out.println(
                "Output:\t" + snake.finalPositionOfSnake(2, new ArrayList<>(Arrays.asList("DOWN", "RIGHT", "UP"))));
    }

    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0;
        int col = 0;
        for (String comm : commands) {
            if (comm.equals("UP")) row--;
            else if (comm.equals("RIGHT")) col++;
            else if (comm.equals("DOWN")) row++;
            else if (comm.equals("LEFT")) col--;
        }
        return row * n + col;
    }
}
