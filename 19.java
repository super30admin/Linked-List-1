/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
Algorithm : One pass

Slow and Fast pointer
fast - > take it to n+1 position.

now increment both slow 1 by 1
 
to avoid losing ref to head as we traverse -> copy head in dummy and use dummy.


TC : O(n)
SC : O(1)

**/

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        //fast goes to n+1 position
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
        
    }
}

