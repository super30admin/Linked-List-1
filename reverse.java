class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next ==null) return head;
        return rev(head);
    }
    private ListNode rev(ListNode head){
        if(head.next==null) return head;
        ListNode reverse = rev(head.next);
        head.next.next=head;
        head.next=null;
        return reverse;
    }
}
