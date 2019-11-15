package ru.trushkin.cv.structures;

public class Stack<T> {

    private Object[] array;
    private int maxDepth;
    private int currentDepth = 0;

    public Stack(int maxDepth) {
        this.maxDepth = maxDepth;
        array = new Object[maxDepth];
    }

    public void push(T element) {
        if (currentDepth + 1 > maxDepth) {
            throw new IllegalArgumentException("too many elements");
        }
        array[currentDepth] = element;
        currentDepth++;
    }

    public T pop() {
        if (currentDepth == 0) {
            throw new IllegalArgumentException("no elements");
        }
        currentDepth--;
        T element = (T) array[currentDepth];
        return element;
    }

    public T peek() {
        if (currentDepth == 0) {
            throw new IllegalArgumentException("no elements");
        }
        return (T) array[currentDepth - 1];
    }

    public boolean hasElement() {
        return currentDepth > 0;
    }
}
