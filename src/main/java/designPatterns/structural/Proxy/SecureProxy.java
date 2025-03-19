package designPatterns.structural.Proxy;

public class SecureProxy implements Image {
    private RealImage realImage;
    private final String filename;
    private final boolean hasAccess;

    public SecureProxy(String filename, boolean hasAccess) {
        this.filename = filename;
        this.hasAccess = hasAccess;
    }

    @Override
    public void display() {
        if (!hasAccess) {
            System.out.println("Access Denied: You don't have permission to view this image.");
            return;
        }
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
