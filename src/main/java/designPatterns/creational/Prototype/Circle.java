package designPatterns.creational.Prototype;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }
}

