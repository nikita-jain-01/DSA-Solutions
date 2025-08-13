package dsa.preparation.linkedlist.lovebabbarsheet;
// https://leetcode.com/problems/middle-of-the-linked-list/

// Not Much Optimal
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        int count = 0, i = 1;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        count = count / 2;
        while (i <= count) {
            temp = temp.next;
            i++;
        }
        head = temp;
        return head;
    }
}

// Optimal Code
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
