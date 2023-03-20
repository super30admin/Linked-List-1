// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
/*
 * I have used a slow pointer and fast pointer that point to head at first. I now traverse through the list until fast!=null and fast.next!=null.
 * If fast==slow, I break from the loop. Else I fast==null or fast.next==null I return null. Now I set the fast ptr back to head and
 * increment both fast and slow pointers one by one until fast!=slow. When fast==slow I return fast ptr as that is the start of the cycle.
 */

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
        if(head==null)
        {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(fast==null || fast.next==null)
        {
            return null;
        }
        fast = head;
        while(fast!=slow)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}