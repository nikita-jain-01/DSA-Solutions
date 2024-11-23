// https://leetcode.com/problems/merge-two-sorted-lists/description/
//
// VIDEO LECTURE - https://www.youtube.com/watch?v=Xb4slcp1U38&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=31
package dsa.preparation.linkedlist.linkedliststriver;

// BRUTE FORCE SOLUTION - TC - O(N1+N2), SC - O(N1+N2)
public class MergeTwoSortedList {

    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node();
        Node dummyList = dummy;
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                dummyList.next = new Node(list1.data);
                if (list1 != null) {
                    list1 = list1.next;
                }
            } else {
                dummyList.next = new Node(list2.data);
                if (list2 != null) {
                    list2 = list2.next;
                }
            }
            dummyList = dummyList.next;
        }
        if (list1 != null) {
            dummyList.next = list1;
        } else {
            dummyList.next = list2;
        }
        return dummy.next;
    }

    // OPTIMAL SOLUTION - TC - O(N1+N2), SC - O(1)
    public Node optimalMergeTwoLists(Node list1, Node list2) {
        Node res, temp;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.data <= list2.data) {
            res = list1;
            temp = list1;
            list1 = list1.next;
        } else {
            res = list2;
            temp = list2;
            list2 = list2.next;
        }
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                System.out.print(temp.next.data + " ");
                list1 = list1.next;
            } else {
                temp.next = list2;
                System.out.print(temp.next.data + " ");
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        }
        if (list2 != null) {
            temp.next = list2;
        }
        return res;
    }
}
