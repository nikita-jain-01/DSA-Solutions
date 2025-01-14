// https://leetcode.com/problems/delete-node-in-a-linked-list/
//
// Video lecture - https://www.youtube.com/watch?v=icnp4FJdZ_c&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=32
package dsa.preparation.linkedlist.striver;

// TC - O(1), SC - O(1)
public class DeleteNodeInListWith1TimeComplexity {

    public void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
