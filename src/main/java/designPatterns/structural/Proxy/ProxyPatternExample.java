package designPatterns.structural.Proxy;

public class ProxyPatternExample {
    public static void main(String[] args) {
        lazyInitializationExample();
        secureExample();
    }

    private static void lazyInitializationExample() {
        System.out.println("\nLazy Initialization Example");
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from disk only when display() is called
        System.out.println("\nFirst call to display()");
        image1.display();  // Loads and displays

        System.out.println("\nSecond call to display()");
        image1.display();  // Reuses loaded image, no disk loading

        System.out.println("\nDisplaying another image");
        image2.display();  // Loads and displays another image
    }

    private static void secureExample() {
        System.out.println("\nSecure Proxy Example\n");
        Image secureImage = new SecureProxy("private_photo.jpg", false);
        secureImage.display();  // Access Denied

        Image allowedImage = new SecureProxy("public_photo.jpg", true);
        allowedImage.display();  // Loads and Displays
    }
}
