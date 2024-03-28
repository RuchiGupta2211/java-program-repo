package org.example;

public class ListNodesSum {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        ListNode l12 = new ListNode(3, null);
        ListNode l11 = new ListNode(4, l12);
        ListNode l1 = new ListNode(2, l11);

        ListNode l23 = new ListNode(4, null);
        ListNode l22 = new ListNode(6, l23);
        ListNode l2 = new ListNode(5, l22);

        ListNode result = addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode tail = headNode; // pointer to head node
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int digit1 = l1 != null ? l1.val : 0;
            int digit2 = l2 != null ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = newNode;
        }
        tail = headNode.next;
        headNode.next = null;
        return tail;
    }
}