package ru.trushkin.cv.algorithms;

import org.testng.annotations.Test;

public class InsertionSortListTest {

    InsertionSortList insertionSortList = new InsertionSortList();

    @Test
    public void testInsertionSortList() {
        var n4 = new InsertionSortList.ListNode(4);
        var n2 = new InsertionSortList.ListNode(2);
        n4.next = n2;
        var n1 = new InsertionSortList.ListNode(1);
        n2.next = n1;
        n1.next = new InsertionSortList.ListNode(3);
        InsertionSortList.ListNode listNode = insertionSortList.insertionSortList(n4);
        System.out.println(listNode);
    }
}