// Time Complexity :
//    removeNthFromEnd() - O(n) - we go through all nodes
//      
// Space Complexity :
//    removeNthFromEnd() - O(1) - two pointer approach
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(n > 0 && fast != null)
        {
            fast = fast.next;
            --n;
        }
        
        if(slow != fast && fast != null)
        {
            while(fast.next != null)
            {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return head;
        }
        return slow.next;
    }
}
