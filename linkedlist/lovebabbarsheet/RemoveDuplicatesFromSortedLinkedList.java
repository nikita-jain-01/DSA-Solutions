package dsa.preparation.linkedlist.lovebabbarsheet;
// https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1

public class RemoveDuplicatesFromSortedLinkedList {
    public ListNode removeDuplicates(ListNode head) {
        ListNode temp = head, prev = head;
        if (head == null || head.next == null)
            return head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
            if (prev.val == temp.val)
                prev.next = temp.next;
            else
                prev = temp;
        }
        return head;
    }
}
