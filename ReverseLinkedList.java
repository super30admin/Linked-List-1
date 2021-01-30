// Time Complexity 0(n)
// Space Complexity 0(1)

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        
        ListNode prev=null;
        ListNode curr=head;
        ListNode forward=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=forward;
            if(curr!=null)
            forward=forward.next;
            
        }
        
        return prev;
    }
}