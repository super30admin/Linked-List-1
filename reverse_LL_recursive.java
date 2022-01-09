// Time Complexity : O(n)
// Space Complexity : O(n) : Recursive Stack

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
        
        // Empty list
        if (head == null){
            return null;
        }
        
        //Base case 
        // Last node
        if (head != null && head.next == null ) {
            return head;
        }
        
        // Recursively call for the next node
        ListNode node = reverseList(head.next);
        
        // Update the pointers in reverse order
        head.next.next = head;
        
        head.next = null;
        
        
        return node;
        
    }
}