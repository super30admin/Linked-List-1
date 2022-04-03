// Time Complexity : O(nodes)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
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
        
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
            {
                flag = true;
                break;
            }
        }
        
        if(flag==false)
            return null;
        
        slow = head;
        
        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}