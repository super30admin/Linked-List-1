// Time Complexity : O(n)
// Space Complexity : O(1)

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // Take a dummy node to avoid the corner cases
        ListNode dummy  = new ListNode(1);
        dummy.next =  head;
        
        // Update the head to dummy
        head = dummy;
       
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Traverse the fast pointer n times 
        // The gap between the slow and fast must be n.
        int count = 0;
        while (count <= n) {
            fast = fast.next;
            count++;
        }
        
        // Move the fast pointer till the end of the list
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        // The slow points to the previous of the nth node
        slow.next = slow.next.next;
        
        return dummy.next;
        
    }
}