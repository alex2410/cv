package ru.trushkin.cv.tasks;

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int previous = 0;
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode currentResult = result;
        while (n1 != null || n2 != null) {
            int v1 = n1 == null ? 0 : n1.val;
            int v2 = n2 == null ? 0 : n2.val;
            currentResult.val = (v1 + v2 + previous) % 10;

            n1 = n1 == null ? null : n1.next;
            n2 = n2 == null ? null : n2.next;
            previous = (v1 + v2 + previous) / 10;
            if (n1 != null || n2 != null) {
                currentResult.next = new ListNode(0);
                currentResult = currentResult.next;
            }
        }
        if (previous != 0) {
            currentResult.next = new ListNode(previous);
        }

        return result;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "" + val + (next != null ? next.toString() : "");
        }
    }
}
