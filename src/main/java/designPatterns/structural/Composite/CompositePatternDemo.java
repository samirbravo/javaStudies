package designPatterns.structural.Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("Document1.txt");
        File file2 = new File("Image1.jpg");
        File file3 = new File("Music1.mp3");

        // Create folders and add files
        Folder documentsFolder = new Folder("Documents");
        documentsFolder.addComponent(file1);

        Folder mediaFolder = new Folder("Media");
        mediaFolder.addComponent(file2);
        mediaFolder.addComponent(file3);

        // Create root folder and add subfolders
        Folder rootFolder = new Folder("Root");
        rootFolder.addComponent(documentsFolder);
        rootFolder.addComponent(mediaFolder);

        // Display file system structure
        rootFolder.showDetails();
    }
}