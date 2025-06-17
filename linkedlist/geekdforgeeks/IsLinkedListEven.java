// https://www.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1?page=2&category=Linked%20List&sortBy=submissions

package dsa.preparation.linkedlist.geekdforgeeks;

import dsa.preparation.linkedlist.striver.Node;

public class IsLinkedListEven {
    public boolean isLengthEven(Node head) {
        // code here
        int count=0;
        Node temp=head;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        return count%2==0;
    }
}
