package ru.trushkin.cv.recursion.reverselist;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseListTest {

    private ReverseList reverseList = new ReverseList();

    @Test
    public void testExecuteExample() {
        Node prev = null;
        Node first = null;
        for (int i = 0; i < 10; i++) {
            Node n = new Node(i);
            if (first == null) {
                first = n;
            }
            if (prev != null) {
                prev.setNext(n);
            }
            prev = n;
        }
        Assert.assertNotNull(first.getNext());
        Assert.assertNull(prev.getNext());
        Assert.assertEquals(first.toString(), "0->1->2->3->4->5->6->7->8->9->null");
        Assert.assertEquals(prev.toString(), "9->null");
        reverseList.executeExample(first);
        Assert.assertEquals(first.toString(), "0->null");
        Assert.assertEquals(prev.toString(), "9->8->7->6->5->4->3->2->1->0->null");
        Assert.assertNotNull(prev.getNext());
        Assert.assertNull(first.getNext());

        Node single = new Node(1);
        reverseList.executeExample(single);
        Assert.assertEquals(single.toString(), "1->null");

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.setNext(node2);
        Assert.assertEquals(node1.toString(), "1->2->null");
        reverseList.executeExample(node1);
        Assert.assertEquals(node2.toString(), "2->1->null");
    }
}