package ru.trushkin.cv.algorithms;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(0);
        ListNode previous = result;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            //ищем место вставки
            while (previous.next != null && previous.next.val < current.val) {
                previous = previous.next;
            }
            ListNode temp = previous.next;
            previous.next = current;
            current.next = temp;
            //следующая итерация
            previous = result;
            current = next;
        }
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return val + (next == null ? "" : "->" + next.toString());
        }
    }
}
