// Time Complexity : O(n). n is the number of nodes in a linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
    int elementPos;
    int sum=0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null) return head;
        
        ListNode fast=head,slow=head;
        int count=0;
        while(count<n){
            fast=fast.next;
            count++;
        }
        
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        
        slow.next=slow.next.next;
        return head;
    }
    
    
    
}

