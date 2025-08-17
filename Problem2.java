// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// We use a two-pointer approach to find the nth node from the end.
// We maintain a fast pointer that is n nodes ahead of the slow pointer.
// When the fast pointer reaches the end, the slow pointer will be at the correct position to remove the target node.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode slow=dummy;
        ListNode fast=dummy;
        int count=0;

        while(count<=n){
            fast=fast.next;
            count++;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp=slow.next;
        slow.next=slow.next.next;
        temp.next=null;

        return dummy.next;
    }
}