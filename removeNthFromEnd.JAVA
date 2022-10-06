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
        
        ListNode dummy=new ListNode(-1,head);
        ListNode sp=dummy;
        ListNode fp=dummy;
        
        int count=0;
        
        while(count<=n)
        {
            fp=fp.next;
            count++;
        }
        
        while(fp!=null)
        {
            fp=fp.next;
            sp=sp.next;
            
        }
        
        sp.next=sp.next.next;
        
        return dummy.next;
        
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no