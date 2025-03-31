package designPatterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements IterableCollection<Book> {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
