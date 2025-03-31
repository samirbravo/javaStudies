package designPatterns.behavioral.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class BookIterator implements Iterator<Book> {
    private final List<Book> books;
    private int index = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return books.get(index++);
    }
}
