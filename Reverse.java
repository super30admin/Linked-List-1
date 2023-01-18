// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//in this approach we just recurse on each node and we make the next of next as head 
//and next to head null.
//recursion
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next== null)return head;
        ListNode reversed = reverseList(head.next);
        head.next.next= head;
        head.next=null;
        return reversed;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
//three pointer solution - in this approach we have a dummy node as prev in the start, then we have curr at head and a next pointer next to head
//we move all three and make the next of head as prev.
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next== null)return head;
        ListNode prev = null;
        ListNode fast = head.next;
        while(fast!=null){
            head.next=prev;
            prev=head;
            head=fast;
            fast=fast.next;
        }
        head.next=prev;
        return head;
        
    }
}
