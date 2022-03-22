//Time Complexity : O(n)
//Space Complexity : O(n)

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
        
        ListNode slow = head;
        ListNode fast = head;
        
        boolean iscycle = false;
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                iscycle = true;
                break;
            }
        }
        
        if(iscycle)
        {
            fast = head;
            
            while(slow!=fast)
            {
                fast = fast.next;
                slow = slow.next;
            }
        }
        else
        {
            return null;
        }
        
        return fast;
    }
}