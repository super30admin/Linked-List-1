// Time Complexity : O(N)
// Space Complexity : O(1)
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