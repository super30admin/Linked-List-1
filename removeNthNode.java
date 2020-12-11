// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I have returned head instead of dummy.next.

// Your code here along with comments explaining your approach

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
        
        
        int i = 0;
        
        ListNode first = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode second = dummy;
        
        while( first != null) {
            
            first = first.next;
            i++;
            
            if(i > n)
                second = second.next;            
        }
        
        ListNode next = second.next.next;
        
        second.next = next;
        
        return dummy.next;
        
    }
}