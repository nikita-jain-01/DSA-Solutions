// https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?page=1&category=Linked%20List&sortBy=submissions

package dsa.preparation.linkedlist.geekdforgeeks;

import dsa.preparation.linkedlist.striver.Node;

public class MiddleOfALinkedList {
    int getMiddle(Node head) {
        // Your code here.
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
