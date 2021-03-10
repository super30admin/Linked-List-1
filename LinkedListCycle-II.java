/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle-II {
    
    // Time Complexity: O(n)    (where n -> no. of nodes in the linked list)
    // Space Complexity: O(1)
    
    public ListNode detectCycle(ListNode head) {
        // Edge Case Checking
        if(head == null)
            return head;
        
        // Initialize Two Pointers
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            // If there is a cycle - then the slow pointer and fast pointers would eventually meet.
            if(slow == fast){
                slow = head;
                // Once the pointers meet - again start traversing from the beginning and move both the pointers at same pace till they meet. The node which they meet is the node where cycle begins.
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }    
        
        // If no cycle present - then return null
        return null;
    }
}