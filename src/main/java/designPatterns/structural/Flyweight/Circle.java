package designPatterns.structural.Flyweight;

public class Circle implements Shape {
    private final String color; // Intrinsic state (shared)
    private int radius; // Intrinsic state (can be fixed)

    // Extrinsic state (unique per object)
    private int x;
    private int y;

    public Circle(String color) {
        this.color = color;
        this.radius = 10; // Fixed radius for simplicity
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Drawing Circle: Color=" + color + ", Radius=" + radius + ", X=" + x + ", Y=" + y);
    }
}