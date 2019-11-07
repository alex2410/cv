package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers.ListNode n1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode n2 = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers.ListNode n3 = new AddTwoNumbers.ListNode(3);
        n1.next = n2;
        n2.next = n3;
        AddTwoNumbers.ListNode n4 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode n5 = new AddTwoNumbers.ListNode(6);
        AddTwoNumbers.ListNode n6 = new AddTwoNumbers.ListNode(4);
        n4.next = n5;
        Assert.assertEquals(addTwoNumbers.addTwoNumbers(n1, n4).toString(), "704");

        n5.next = n6;
        Assert.assertEquals(addTwoNumbers.addTwoNumbers(n1, n4).toString(), "708");
    }
}