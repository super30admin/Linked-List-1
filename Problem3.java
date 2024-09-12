// Time Complexity: O(n)
// Space Complexity: O(1)

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
        ListNode fast =head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){ // if true we have a cycle

                // Now comes the part where we find the start index of the cycle.
                // Essentially we are going to make use of the concept that speed of
                // fast = 2*speed of slow. So if we think of the distance of the start of the cycle 
                // from the node as x, and the distance from start of cycle till where 
                // my fast == slow as y, and the distance from that point to again the cycle as z
                // then my slow traverses (x+y) distance and my fast traverses (x+2y+z) distance.
                // And from the above condition we know that 2*(x+y) = (x+2y+z)
                // which gives us x = z. So, we move our head my one node and move our slow 
                // at the same time, until they meet, where they meet will be the start of the
                // cycle.             
                
                while(head != slow){
                    head = head.next;
                    slow = slow.next;
                }
                return head;
            }
        }
        
        return null; // no cycle
    }
}
