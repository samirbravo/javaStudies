package dataStructures;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.add(new Ball("red"));

        System.out.println("balls size: " + balls.size()); // 3 because it wont take duplicates
        balls.forEach(System.out::println); // does not guarantee order

    }

    record Ball(String color) {
    }
}
