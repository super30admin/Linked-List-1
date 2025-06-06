// Time Complexity : O(n) one pass
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : use two pointers - fast and slow. Place fast (n+1) steps ahead of slow
// now move both one step ahead together. When fast reaches null, slow is before node to be deleted, just delete it now

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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        while(n-->=0){
            
            System.out.println(fast.val);
            fast = fast.next;
            if(fast==null)
                fast = dummy;
            
        }
        
        while(fast!=null && slow!=null){
            fast = fast.next;
            slow = slow.next;
            if(slow == null){
                slow = dummy;
            }
        }
        
        if(slow!=null && slow.next!=null)
        {
            slow.next = slow.next.next;
        }
        return dummy.next;
    }
}