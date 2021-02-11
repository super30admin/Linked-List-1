// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // use two pointers
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // separate both pointers by n
        while(n>=0) {
            fast=fast.next;
            n--;
        }
        
        // move both pointers keeping space in them n
        while(fast!=null) {
            fast = fast.next;
            slow=slow.next;
        }
        
        // remove nth node
        slow.next=slow.next.next;
        return dummy.next;
    }
}
