// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Using slow and fast pointer approach to detect if the cycle exists.
// Again iterating from the start and the slow pointer we can find the start of the cycle.
// Since the slow pointer after cycle detection will be x nodes from the start of cycle same as the x nodes from the start of the list.

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
        if(head == null) return head;
        ListNode slow = head,fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = head;
        fast = fast.next;
        while( slow != fast){
            if(fast == null || fast.next == null)
                return null;
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
