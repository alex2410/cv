package ru.trushkin.cv.recursion.reverselist;

import ru.trushkin.cv.runner.ExampleRunner;

/**
 * Разворачивает однонаправленный список
 * было 1->2->3->null стало 3->2->1->null
 */
public class ReverseList implements ExampleRunner<Void, Node> {

    @Override
    public Void executeExample(Node node) {
        reverse(node);
        return null;
    }

    private Node reverse(Node node) {
        Node next = node.getNext();
        node.setNext(null);
        if (next == null) {
            return node;
        } else {
            Node newNode = reverse(next);
            newNode.setNext(node);
            return node;
        }
    }
}
