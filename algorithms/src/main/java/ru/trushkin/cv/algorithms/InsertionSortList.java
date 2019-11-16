package ru.trushkin.cv.algorithms;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(0);
        ListNode sorted = result;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            //ищем место вставки
            while (sorted.next != null && sorted.next.val < current.val) {
                sorted = sorted.next;
            }
            ListNode temp = sorted.next;
            sorted.next = current;
            current.next = temp;
            //следующая итерация
            sorted = result;
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
