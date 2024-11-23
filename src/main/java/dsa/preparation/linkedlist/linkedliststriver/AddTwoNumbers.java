// https://leetcode.com/problems/add-two-numbers/
//
// Video Lecture - https://www.youtube.com/watch?v=LBVsXSMOIk4&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=33
package dsa.preparation.linkedlist.linkedliststriver;

// TC - O(Max(N,M)), SC - O(Max(M,N))
public class AddTwoNumbers {

    public Node addTwoNumbers(Node temp1, Node temp2) {
        Node dummy = new Node();
        Node dummyList = dummy;
        int k = 0;
        while (temp1 != null || temp2 != null || k > 0) {
            int x = (temp1 == null) ? 0 : temp1.data;
            int y = (temp2 == null) ? 0 : temp2.data;
            int sum = x + y + k;
            k = sum / 10;
            dummyList.next = new Node(sum % 10);
            dummyList = dummyList.next;
            if (temp1 != null) {
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }
        return dummy.next;
    }
}
