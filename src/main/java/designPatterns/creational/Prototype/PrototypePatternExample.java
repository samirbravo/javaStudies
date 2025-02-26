package designPatterns.creational.Prototype;

public class PrototypePatternExample {
    public static void main(String[] args) {
        ShapeRegistry registry = new ShapeRegistry();
        registry.addShape("big_circle", new Circle(10));
        registry.addShape("small_rectangle", new Rectangle(4, 2));

        Shape clonedCircle = registry.getShape("big_circle");
        clonedCircle.draw();

        Shape clonedRectangle = registry.getShape("small_rectangle");
        clonedRectangle.draw();
    }
}
