// Here we reverse linked list using three pointer and a single pass
// TC: O(n) : where n is the number of nodes in the linked list
// SC O(1) : We are not using any additional space other than constant space for pointers

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        // Stores current node
        ListNode current = head;
        // Store previous next
        ListNode prevNext = null;
        // Stores previous node
        ListNode prev = null;

        while(current!=null){
            // Update Previous Next to current node's next
            prevNext = current.next;
            // Current Node's next is the prev current which is the previous node
            current.next = prev;
            // Previous node is the current node as we are about to update current node
            prev = current;
            // Update current node to previous next which should have been the actual next if we didnt update 
            // This will ensure we continue the pass
            current = prevNext;
        }
        // The prev would be pointing to the previous head which is the previous last node as we have reversed it
        return prev;
    }
}
