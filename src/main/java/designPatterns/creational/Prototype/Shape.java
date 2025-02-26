package designPatterns.creational.Prototype;

public interface Shape extends Cloneable {
    Shape clone();

    void draw();
}
