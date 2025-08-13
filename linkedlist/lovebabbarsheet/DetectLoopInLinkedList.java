package dsa.preparation.linkedlist.lovebabbarsheet;
// https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

import java.util.HashMap;

public class DetectLoopInLinkedList {
    public static boolean detectLoop(ListNode head) {
        ListNode temp = head;
        HashMap<ListNode, Integer> storingNodes = new HashMap<>();
        while (temp != null) {
            if (storingNodes.containsKey(temp))
                return true;
            else
                storingNodes.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
}