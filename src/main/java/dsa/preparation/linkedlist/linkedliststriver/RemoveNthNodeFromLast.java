// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
package dsa.preparation.linkedlist.linkedliststriver;

public class RemoveNthNodeFromLast {

    // TC - O(2N), SC - O(1)
    public Node removeNthFromEnd(Node head, int n) {
        Node temp = head;
        int count = 0, curr = 0;
        if (head == null || (head.next == null && n == 1)) {
            return null;
        }
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (count == n) {
            return head.next;
        }
        temp = head;
        while (temp != null) {
            if (curr == (count - n - 1) && temp.next != null) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
            curr++;
        }
        return head;
    }

    // TC - O(N), SC - O(1)
    public Node usingSpaceRemoveNthFromEnd(Node head, int n) {
        Node dummy = new Node();
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow != null && slow.next != null) {
            slow.next = slow.next.next;
        }
        return dummy.next;
    }
}
