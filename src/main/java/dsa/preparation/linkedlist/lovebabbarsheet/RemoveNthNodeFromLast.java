package dsa.preparation.linkedlist.lovebabbarsheet;
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

public class RemoveNthNodeFromLast {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        ListNode slow = dummy;
        ListNode fast = null;
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                fast = head;
                slow.next = head;
            }
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
