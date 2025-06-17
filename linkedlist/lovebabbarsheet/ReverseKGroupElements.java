package dsa.preparation.linkedlist.lovebabbarsheet;
// https://leetcode.com/problems/reverse-nodes-in-k-group/description/

class ReverseKGroupElements {
    public ListNode reverseKGroupElements(ListNode head, int k) {
        if ((head == null || head.next == null) || k == 1)
            return head;
        if (check(head, k))
            return head;
        ListNode t = head, th = head, prev = null;
        int count = k;
        while (count > 0 && head != null) {
            t = head;
            head = head.next;
            t.next = prev;
            prev = t;
            count--;
        }
        th.next = head;
        th.next = reverseKGroupElements(head, k);
        return prev;
    }

    public boolean check(ListNode temp, int k) {
        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }
        if(k == 0)
            return false;
        return true;
    }
}