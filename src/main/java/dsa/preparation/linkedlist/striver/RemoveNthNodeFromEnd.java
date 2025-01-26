// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=study-plan-v2&envId=top-100-liked

package dsa.preparation.linkedlist.striver;

import dsa.preparation.linkedlist.lovebabbarsheet.ListNode;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0, traverse=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        temp=head;
        if(count-n==0)
            return head.next;
        while(temp!=null) {
            traverse++;
            if(traverse==count-n) {
                temp.next=temp.next.next;
                return head;
            }
            else
                temp=temp.next;
        }
        return head;
    }
}
