// https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1

package dsa.preparation.linkedlist.geekdforgeeks;

import dsa.preparation.linkedlist.striver.Node;

public class RotateALinkedList {
    public Node rotate(Node head, int k) {
        Node temp=head, slow=head, fast=head;
        int count=0;
        while(temp!=null) {
            count++;
            if(count==k) {
                fast=temp.next;
                temp.next=null;
                temp=fast;
            }
            if(count>k && temp.next!=null)
                temp=temp.next;
            if(count>k && temp.next==null) {
                temp.next=slow;
                return fast;
            }
            if(count<k)
                temp=temp.next;
        }
        if(count==k || k==0)
            return head;
        if(count<k) {
            k=k%count;
            if(k==0)
                return head;
            count=0;
            while(count!=k) {
                temp=fast;
                fast=fast.next;
                count++;
            }
            temp.next=null;
            temp=fast;
            while(temp!=null && temp.next!=null) {
                temp=temp.next;
            }
            temp.next=slow;
            return fast;
        } else {
            temp=slow;
            return fast;
        }
    }
}
