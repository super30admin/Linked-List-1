// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

public class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        slow=head.next;
        fast=head.next.next;
        if(fast==null)
            return null;
        while(fast.next!=null && fast.next.next!=null){
            if(slow==fast)
                break;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow!=fast)
            return null;
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
