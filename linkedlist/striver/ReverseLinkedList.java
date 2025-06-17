// https://leetcode.com/problems/reverse-linked-list/
// https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
// Video lecture - https://www.youtube.com/watch?v=D2vI2DNJGd8
package dsa.preparation.linkedlist.striver;

// BRUTE FORCE SOLUTION - Use stack, first traverse list and put all elements in
// stack. Then traverse one more time and take out every element from stack
// TC - O(2N), SC - O(N)
//
//
// OPTIMAL SOLUTION - O(N), SC - O(1)
public class ReverseLinkedList {

    // Iterative
    public Node reverseList(Node head) {
        Node temp = head, prev = null, curr;
        while (temp != null) {
            curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }
        head = prev;
        return head;
    }

    // Recursive - TC - O(N), SC - O(N)[Because when we're calling it is remaining in stack]
    public Node recursiveReverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = recursiveReverseList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
