/****************** Time Complexity: O(n) ********************/
/****************** Space Complexity: O(1) ********************/

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        // base case
        if(head == null)
            return null;
        // slow and fast pointer where slow increments +1
        // fast increments +2
        ListNode slow = head;
        ListNode fast = head;
        
        // while fast and its next is not null
        while(fast!= null && fast.next != null){
            // initializing slow and fast pointer
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){               // cycle exists
                while(slow!=head){          // one cycle completes
                    slow = slow.next;
                    head = head.next;
                }
                return slow;                // cycle starts from here
            }
        }
        return null;
        
    }
}