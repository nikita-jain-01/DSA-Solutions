// https://leetcode.com/problems/middle-of-the-linked-list/
package dsa.preparation.linkedlist.linkedliststriver;

public class MiddleOfLinkedList {

    public Node middleNode(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
