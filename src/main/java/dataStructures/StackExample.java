package dataStructures;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(7);

        System.out.println("Stack size:" + stack.size());
        System.out.println("Peek the first one: " + stack.peek());
        System.out.println("Stack size:" + stack.size());
        System.out.println("Pop the first one: " + stack.pop());
        System.out.println("Stack size:" + stack.size());
        System.out.println("Stack empty: " + stack.empty());
    }
}