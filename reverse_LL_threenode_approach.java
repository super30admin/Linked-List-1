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
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        
        // Iterate through all the nodes in the list
        while (curr != null){ 
        
            // The next node will become the previous node
            curr.next = prev;
            
            // Move the pointers one step ahead to get the next node
            prev = curr;
            
            curr = next;
            
            if ( next != null ){
                next = next.next;
            }
            
            
        }
        
        // As curr reaches null, we need prev node 
        return prev;
        
    }
}