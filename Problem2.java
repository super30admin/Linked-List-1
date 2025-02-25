class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy= new ListNode(0);
        dummy.next= head;
        ListNode slow= head;
        int l =0;
        while(slow!=null){
            slow=slow.next;
            l++;
        }
        int l1=l-n;
        if(l1==0) return head.next;

        ListNode prev = dummy;
        ListNode curr=head;
        int i=0;
        while(i<l1 ){
            ListNode temp=curr.next;

            prev=curr;
            curr=temp;
            i++;

        }
        prev.next =curr.next;
        curr.next=null;
        return head;

    }
}