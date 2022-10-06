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
    public ListNode reverseList(ListNode head) {
        
        if(head==null) return head;
        
        ListNode prev=null;
        
        ListNode cur=head;
        
        ListNode nxt=head.next;
        
        while(nxt!=null)
        {
            cur.next=prev;
            prev=cur;
            cur=nxt;
            nxt=nxt.next;
        }
        if(cur!=null)
            cur.next=prev;
        
        return cur;
        
        
        
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no