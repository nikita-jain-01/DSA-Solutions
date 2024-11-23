// https://leetcode.com/problems/delete-node-in-a-linked-list/description/
package dsa.preparation.linkedlist.linkedliststriver;

// TC - O(1)
// SC - O(1)
public class DeletingNodeInLinkedList {

    public void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;

    }
}
