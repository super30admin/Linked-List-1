// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

// Your code here along with comments explaining your approach
/*
Have a prev and curr ptr, change ptrs as we loop to end of LinkedList
* */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;

        ListNode curr=head.next, prev=head;

        while(curr!=null){
            prev.next=curr.next;
            curr.next=head;
            head=curr;
            curr=prev.next;
        }

        return head;
    }
}
