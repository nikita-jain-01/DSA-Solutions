package dsa.preparation.linkedlist.lovebabbarsheet;
// https://leetcode.com/problems/reverse-linked-list/

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        if (head == null) {
            return head;
        }
        while (curr != null) {
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
}