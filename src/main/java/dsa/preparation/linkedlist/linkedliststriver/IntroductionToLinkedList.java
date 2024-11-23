// https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list
package dsa.preparation.linkedlist.linkedliststriver;

public class IntroductionToLinkedList {

    static Node constructLL(int arr[]) {

        Node head = null, temp = null, mover = null;
        for (int i = 0; i < arr.length; i++) {
            if (head == null) {
                head = new Node(arr[i]);
                mover = head;
            } else {
                temp = new Node(arr[i]);
            }
            mover.next = temp;
            if (mover.next != null) {
                mover = mover.next;
            }
        }
        return head;
    }
}
