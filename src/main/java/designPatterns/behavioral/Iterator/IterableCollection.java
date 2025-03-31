package designPatterns.behavioral.Iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
