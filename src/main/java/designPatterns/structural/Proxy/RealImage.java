package designPatterns.structural.Proxy;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();  // Simulates heavy resource loading
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying Image: " + filename);
    }
}
