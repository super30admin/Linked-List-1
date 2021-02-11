// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null) return head;
    
        ListNode prev = null;
        ListNode curr = head;
        
        // for every node point curr node to previous node
        // continue until current node is not null
        while(curr != null) {
            
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
            
        }
        
        
        return prev;
    }
}
