package designPatterns.creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private final Map<String, Shape> shapeMap = new HashMap<>();

    public void addShape(String key, Shape shape) {
        shapeMap.put(key, shape);
    }

    public Shape getShape(String key) {
        return shapeMap.get(key).clone();
    }
}
