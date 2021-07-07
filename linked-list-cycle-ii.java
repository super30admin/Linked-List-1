// Time Complexity : O(N)
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
        //base case
        if(head == null)
            return head;
        
        //logic
        ListNode slow=head, fast=head;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;  
            
            if(slow == fast) //cycle detected
            {
                slow=head;
                while(slow != fast) //to find the beginning of cycle
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}