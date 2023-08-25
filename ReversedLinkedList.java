public class ReversedLinkedList {
    //Time Complexity = O(1)
    // Space Complexity = O(1)
    ListNode reversed;
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode prev=null;
        ListNode curr=head;
        ListNode fast=head.next;
        while(fast!=null){
            curr.next=prev;
            prev=curr;
            curr=fast;
            fast=fast.next;
        }
        curr.next=prev;
        return curr;
    }
}
