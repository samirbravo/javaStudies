package dataStructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.addLast(new Person("Lex", 21));
        linkedList.addFirst(new Person("Ale", 21));
        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Marian", 18));
        queue.add(new Person("Ali", 40));

        System.out.println("size: " + queue.size());
        System.out.println("peek: " + queue.peek());
        System.out.println("poll: " + queue.poll());
        System.out.println("size: " + queue.size());
        System.out.println("peek: " + queue.peek());
    }

    record Person(String name, int age) {
    }
}
