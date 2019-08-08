package ru.trushkin.cv.recursion.reverselist;

public class Node {
    private Node next;
    private int number;

    Node(int number) {
        this.number = number;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return number + "->" + next;
    }
}
