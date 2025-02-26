package designPatterns.creational.Prototype;

public class Rectangle implements Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width: " + width + " and height: " + height);
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height);
    }
}
