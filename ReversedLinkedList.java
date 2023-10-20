// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class ReversedLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        if(curr==null)
        return curr;
        ListNode fast = curr.next;
        ListNode prev=null;
        while(fast!=null){
            curr.next = prev;
            prev=curr;
            curr=fast;
            fast=fast.next;
        }
        curr.next = prev;
        return curr;
    }
}