package ru.trushkin.cv.structures;

import java.util.concurrent.atomic.AtomicReference;

public class ConcurrentStack<T> {
    private final AtomicReference<Node> head = new AtomicReference<>(null);

    public void push(final T value) {
        Node current;
        Node newValue = new Node(value);
        do {
            current = head.get();
            newValue.previous = current;
        } while (!head.compareAndSet(current, newValue));
    }

    public T pop() {
        Node result;
        Node newHead;
        do {
            result = head.get();
            if (result == null) {
                return null;
            }
            newHead = result.previous;
        } while (!head.compareAndSet(result, newHead));

        return result.value;
    }

    private class Node {
        private T value;
        private Node previous;

        public Node(T value) {
            this.value = value;
        }
    }
}
