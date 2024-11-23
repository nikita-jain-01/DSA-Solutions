// https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion
package dsa.preparation.linkedlist.linkedliststriver;

public class InsertingNodeInLinkedList {

    Node insertAtBeginning(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    Node insertAtEnd(Node head, int x) {
        if (head == null) {
            return new Node(x);
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(x);
        return head;
    }
}
