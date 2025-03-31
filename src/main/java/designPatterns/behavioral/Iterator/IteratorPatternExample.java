package designPatterns.behavioral.Iterator;

public class IteratorPatternExample {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("The Hobbit"));
        bookCollection.addBook(new Book("1984"));
        bookCollection.addBook(new Book("Neuromancer"));

        Iterator<Book> iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            System.out.println("Book: " + iterator.next().getTitle());
        }
    }
}
