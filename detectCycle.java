// Time Complexity : O(n), where n is the number of nodes in the linked list
// Space Complexity : O(1), no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * 1. Use two pointers, slow and fast. Move slow by one and fast by two nodes.
 * 2. If slow and fast meet, then there is a cycle.
 * 3. If there is a cycle, then move slow to head and start moving both pointer at same pace i.e by 1 step. 
 *      They will meet at the start of the cycle and return the node.   
 * 4. If there is no cycle, then return null.
 */

class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head, fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }
}