// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

// Your code here along with comments explaining your approach
/*
Have 2ptrs first move curr ptr to n value from dummy node, then move prev ptr till curr is null
from there remove prev next node
* */
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy, curr=dummy;
        for(int i=0;i<n+1;i++)
            curr=curr.next;


        while(curr!=null){
            curr=curr.next;
            prev=prev.next;
        }

        prev.next= prev.next.next;

        return dummy.next;
    }
}
