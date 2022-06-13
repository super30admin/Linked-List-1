// Time Complexity : O(N) where N is the number of array elements
// Space Complexity : O(1)
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