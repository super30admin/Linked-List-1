/*
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head is None:
            return None
        flag = False
        slow, fast = head, head
        
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                flag = True
                break
        
        if not flag:
            return None
        
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow
*/

// Time Complexity : O(n) where n is no of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: if slow pointer advances one and fast pointer advances two steps at a time
// then they will meet somewhere if there is cycle. When we find cycle I reset slow back to head and this time both pointers move one
// step at a time
    public ListNode detectCycle(ListNode head) {
        if ( head == null)
            return null;
        
        ListNode slow = head, fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast){
                cycle = true;
                break;
            }
        }
        
        if (!cycle){
            return null;
        }
        
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast=fast.next;
        }
        return slow;
    }
}