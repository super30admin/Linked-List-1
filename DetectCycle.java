// Time Complexity : O(N) where N is the number of array elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

// Your code here along with comments explaining your approach
/*
Use 2 ptrs, slow and fast- to find if cycle exists, from the point of intersection of slow and fast, move slow ptr
move curr ptr from head, their intersection is the cycle start point
* */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;

        ListNode slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }

        if(fast.next==null || fast.next.next==null) return null;

        ListNode curr=head;
        while(slow!=curr){
            slow=slow.next;
            curr=curr.next;
        }

        return curr;
    }
}
