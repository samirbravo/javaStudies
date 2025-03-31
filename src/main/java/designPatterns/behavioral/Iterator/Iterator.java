package designPatterns.behavioral.Iterator;

public interface Iterator<T> {
    boolean hasNext();

    T next();
}
