package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();

        CustomStack<Integer> customStack = new CustomStack<>();
        customStack.push(10);
        customStack.push(20);
        customStack.push(30);

        System.out.println(customStack.peek());
        System.out.println(customStack.pop());

        System.out.println("Queue");
        CustomQueue<Integer> customQueue = new CustomQueue<>();
        customQueue.push(10);
        customQueue.push(20);
        customQueue.push(30);

        System.out.println(customQueue.peek());
        System.out.println(customQueue.pop());

    }
}

class CustomStack<T> {
    private Deque<T> deque;

    public CustomStack() {
        this.deque = new ArrayDeque<>();
    }

    public void push(T value) {
        deque.offerFirst(value);
    }

    public T pop() {
        return deque.pollFirst();
    }

    public int size() {
        return deque.size();
    }

    public T peek() {
        return deque.peekFirst();
    }
}


class CustomQueue<T> {
    private Deque<T> deque;

    public CustomQueue() {
        this.deque = new ArrayDeque<>();
    }

    public void push(T value) {
        deque.offerLast(value);
    }

    public T pop() {
        return deque.pollFirst();
    }

    public int size() {
        return deque.size();
    }

    public T peek() {
        return deque.peekFirst();
    }
}
