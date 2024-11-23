// https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list
package dsa.preparation.linkedlist.linkedliststriver;

public class LengthOfLinkedList {

    public static int getCount(Node head) {
        Node temp = head;
        int count = 1;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
