package designPatterns.structural.Flyweight;

import java.util.Random;

public class FlyweightPatternExample {
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String color = colors[random.nextInt(colors.length)];
            Shape circle = ShapeFactory.getCircle(color);

            int x = random.nextInt(100);
            int y = random.nextInt(100);
            circle.draw(x, y);
        }
    }
}
