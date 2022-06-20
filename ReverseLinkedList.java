//Time Complexity=O(n)
//Space Complexity=O(1)
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode prev=null,next,curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head=prev;
        return head;
    }
}
