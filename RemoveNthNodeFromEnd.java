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
class RemoveNthNodeFromEnd {
    
    // Time Complexity: O(n)    (where n -> no. of nodes in the linked list)
    // Space Complexity: O(1)
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Edge Case Checking
        if(head == null)
            return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        // Initialize two pointers
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        
        // Keep the distance between the pointers equal to n
        while(n-- > 0)
            p2 = p2.next;
        
        // Move the second pointer till the end
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        // Assign the next node after first pointer
        p1.next = p1.next.next;
        
        return dummy.next;
    }
}