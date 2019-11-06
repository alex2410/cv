package ru.trushkin.cv.structures;

import java.util.concurrent.Semaphore;

public class SemaphoreStack<T> {
    private final Semaphore semaphore = new Semaphore(1);
    private Node head;

    public void push(final T value) {
        try {
            semaphore.acquireUninterruptibly();
            Node newHead = new Node(value);
            newHead.previous = head;
        } finally {
            semaphore.release();
        }
    }

    public T pop() {
        try {
            semaphore.acquireUninterruptibly();
            T result = head == null ? null : head.value;
            head = head == null ? null : head.previous;
            return result;
        } finally {
            semaphore.release();
        }
    }

    private class Node {
        private T value;
        private Node previous;

        public Node(T value) {
            this.value = value;
        }
    }
}
